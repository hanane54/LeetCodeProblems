// Runtime 1ms Beats 79.37%
// Memory 41.26MB Beats 91.61%

public class LongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        if (name.isEmpty() || typed.isEmpty()) {
            return false;
        }
        
        int nameIndex = 0;
        int typedIndex = 0;
        
        while (typedIndex < typed.length()) {
            if (nameIndex < name.length() && name.charAt(nameIndex) == typed.charAt(typedIndex)) {
                nameIndex++;
                typedIndex++;
            } else if (typedIndex > 0 && typed.charAt(typedIndex) == typed.charAt(typedIndex - 1)) {
                typedIndex++;
            } else {
                return false;
            }
        }
        
        return nameIndex == name.length();
    }
    public static void main(String[] args) {
        LongPressedName solution = new LongPressedName();
 
        // Test Case 1: Example 1 from description
        System.out.println("Test Case 1:");
        String name1 = "alex";
        String typed1 = "aaleex";
        System.out.println("Name: \"" + name1 + "\"");
        System.out.println("Typed: \"" + typed1 + "\"");
        System.out.println("Expected Output: true");
        System.out.println("Actual Output: " + solution.isLongPressedName(name1, typed1));
        System.out.println();


        // Test Case 1: Example 1 from description
        System.out.println("Test Case 2:");
        String name2 = "saeed";
        String typed2 = "ssaaedd";
        System.out.println("Name: \"" + name2 + "\"");
        System.out.println("Typed: \"" + typed2 + "\"");
        System.out.println("Expected Output: false");
        System.out.println("Actual Output: " + solution.isLongPressedName(name2, typed2));
        System.out.println();
 
 
    }
}
