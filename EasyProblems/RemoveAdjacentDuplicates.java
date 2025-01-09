// Runtime 11ms Beats 87.39%

// Memory 45.32MB Beats 69.04%

public class RemoveAdjacentDuplicates {
    public String removeDuplicates(String s) {
        // this is my intuitive solution, but it gives a time exceeded exception
        // boolean adjacentFound = false;
        // for ( int i=0; i<s.length()-1;i++ ){
        //     if( s.charAt(i)==s.charAt(i+1) ){
        //         s =  s.substring(0, i) + s.substring(i + 2);  ;
        //         adjacentFound=true;
        //         break;
        //     }
        // }
        // if ( adjacentFound ){
        //     s = removeDuplicates(s);
        // }
        // return s;
        StringBuilder stack = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            // going through each character, if we find a that the character is already inserted and equals to the next current one, 
            // then we would delete the recently added one
            if (stack.length() > 0 && stack.charAt(stack.length() - 1) == c) {
                stack.deleteCharAt(stack.length() - 1);
            } else {
                stack.append(c);
            }
        }
        
        return stack.toString();
    }

    public static void main(String[] args) {
        RemoveAdjacentDuplicates solution = new RemoveAdjacentDuplicates();
        
        // Test case 1
        String input1 = "abbaca";
        System.out.println("Test Case 1:");
        System.out.println("Input: " + input1);
        System.out.println("Output: " + solution.removeDuplicates(input1));
        System.out.println("Expected: ca");
        System.out.println();
        
        // Test case 2
        String input2 = "azxxzy";
        System.out.println("Test Case 2:");
        System.out.println("Input: " + input2);
        System.out.println("Output: " + solution.removeDuplicates(input2));
        System.out.println("Expected: ay");
    }
}