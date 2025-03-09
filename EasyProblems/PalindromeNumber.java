class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String intToString = String.valueOf(x);

        int middleIndex = (intToString.length()) / 2;

        if (middleIndex % 2 == 1) {
            middleIndex = middleIndex - 1;
        }
        for (int i = 0; i <= middleIndex; i++) {
            if (!(intToString.charAt(i) == intToString.charAt(intToString.length() - 1 - i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeNumber test = new PalindromeNumber();
        
        // Test cases
        int[] numbers = {10, -121, 12321, 12345, 11, 121};
        
        for (int num : numbers) {
            boolean result = test.isPalindrome(num);
            System.out.println(num + " is palindrome: " + result);
        }
    }
}