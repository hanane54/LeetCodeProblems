package HackeRank;
public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        // Write your code here
        boolean valleyDown = false;
        // boolean valleyUp = false;
        int valleysCount = 0;

        int scale = 0;

        char[] pathArray = path.toCharArray();
        for (int i = 0; i < pathArray.length; i++) {
            if (pathArray[i] == 'U') {
                if (scale == -1 && valleyDown) {
                    valleysCount++;
                }
                scale++;
            } else if (pathArray[i] == 'D') {
                scale--;
            }
            if (scale < 0) {
                valleyDown = true;
                // valleyUp = false;
            } else if (scale > 0) {
                valleyDown = false;
                // valleyUp = true;
            } else if (scale == 0) {
                valleyDown = false;
                // valleyUp = false;
            }
        }

        return valleysCount;
    }

    public static void main(String[] args) {
        // Hardcoded test values
        int steps = 8;
        String path = "UDDDUDUUDDUU";

        int result = countingValleys(steps, path);
        System.out.println(result); // Expected output: 1
    }
}
