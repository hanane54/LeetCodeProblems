import java.util.LinkedList;
import java.util.Queue;

public class SimpleRateLimiter {
    private final int maxCalls;
    private final long timeWindow;
    private final Queue<Long> timestamps = new LinkedList<>();

    public SimpleRateLimiter(int maxCalls, long timeWindow) {
        this.maxCalls = maxCalls;
        this.timeWindow = timeWindow;
    }

    public synchronized boolean tryCall() {
        long currentTime = System.currentTimeMillis();

        // Remove expired calls
        while (!timestamps.isEmpty() && 
              (currentTime - timestamps.peek() > timeWindow)) {
            timestamps.poll();
        }

        // Check if we can accept a new call
        if (timestamps.size() < maxCalls) {
            timestamps.add(currentTime);
            return true;
        }

        return false;
    }

    public static void main(String[] args) throws InterruptedException {
        SimpleRateLimiter limiter = new SimpleRateLimiter(3, 2000);
        
        System.out.println("Testing rate limiter (3 calls/2s):");
        System.out.println("Call 1: " + (limiter.tryCall() ? "Allowed" : "Blocked")); // Now ALLOWED
        System.out.println("Call 2: " + (limiter.tryCall() ? "Allowed" : "Blocked"));
        System.out.println("Call 3: " + (limiter.tryCall() ? "Allowed" : "Blocked"));
        System.out.println("Call 4: " + (limiter.tryCall() ? "Allowed" : "Blocked")); // Blocked
        
        Thread.sleep(2000);
        System.out.println("Call 5: " + (limiter.tryCall() ? "Allowed" : "Blocked")); // Allowed
    }
}