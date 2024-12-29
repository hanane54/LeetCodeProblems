// Runtime 1ms Beats 47.98%
// Memory 40.94MB Beats 47.06%
class AddDigits {
    public int addDigits(int num) {
       
        String string_number = Integer.toString(num);
        int sum = Character.getNumericValue(string_number.charAt(0));
        while ( string_number.length() > 1 ) {
           sum = 0;
            for (int i = 0; i < string_number.length(); i++) {
                        sum = sum + Character.getNumericValue(string_number.charAt(i));
            }
            string_number = Integer.toString(sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        AddDigits solution = new AddDigits();
        
        // Test case 1: num = 38
        int test1 = 38;
        int result1 = solution.addDigits(test1);
        System.out.println("Testing number: " + test1);
        System.out.println("Result: " + result1);
        
        // Test case 2: num = 0
        int test2 = 0;
        int result2 = solution.addDigits(test2);
        System.out.println("\nTesting number: " + test2);
        System.out.println("Result: " + result2);
        
        // Additional test case with a larger number
        int test3 = 123;
        int result3 = solution.addDigits(test3);
        System.out.println("\nTesting number: " + test3);
        System.out.println("Result: " + result3);
    }
}
