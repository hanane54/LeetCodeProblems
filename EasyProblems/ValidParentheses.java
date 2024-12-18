
import java.util.Stack;

class ValidParentheses {
    public boolean isValid(String s) {
       // use a Stack
        Stack<Character> stk = new Stack<>();  
        String str = s.replaceAll("\\s+","");
        for ( int i=0; i<str.length(); i++ ){
            if ( str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[' ){
                // push to add the element to the stack, it is considered in the top of the stack
                stk.push(str.charAt(i) );
            } 
            else if ( !stk.empty() ){
                 if ( str.charAt(i) == ')' && stk.peek() == '(' ){
                //pop would delete the last entered element to the stack ( the top of the stack )
                stk.pop();
                // peek returns the last element added to the stack 
                } else if ( str.charAt(i) == '}' && stk.peek() == '{' ){
                    stk.pop();
                } else if ( str.charAt(i) == ']' && stk.peek() == '[' ){
                    stk.pop();
                } else {
                    return false;
                }
            }
            else {
                return false;
            } 
            
           
        }
        // if the str is empty we should return a false 
        // if the stack is not empty it means that there are still an opening parantheses that is not closed
        return stk.empty() && !str.isEmpty();
    }

    public static void main(String[] args) {
        Parentheses checker = new Parentheses();
        
        // Test cases
        String[] testCases = {
            "(])",
            "]",      // Valid
            "([{}])",       // Valid
            "({[]})",       // Valid
            "(){}[]",           // Invalid
            "([)]",         // Invalid
            "",             // Valid (empty string)
            "((()))"        // Valid
        };
        
        for (String testCase : testCases) {
            System.out.println("Input: " + testCase + 
                               " | Is Valid: " + checker.isValid(testCase));
        }
    }
}