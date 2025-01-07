import java.util.HashMap;
import java.util.Map;

// Runtime 29ms Beats 11.15%
// Memory 45.46MB Beats 24.40%
public class UniqueEmailAddress {
    public int numUniqueEmails(String[] emails) {
        Map<Integer, String> emailsMap = new HashMap<>();
        for ( int i=0; i<emails.length; i++ ){
            String uniqueEmail = emails[i].split("@")[0].replaceAll("\\.", "").split("\\+")[0] + "@" + emails[i].split("@")[1] ;
            if ( !emailsMap.containsValue(uniqueEmail)  ){
                emailsMap.put(i, uniqueEmail );
            }
        }
        return emailsMap.size();
    }

    public static void main(String[] args) {
        UniqueEmailAddress solution = new UniqueEmailAddress();
        
        // Test Case 1
        String[] emails1 = {
            "test.email+alex@leetcode.com",
            "test.e.mail+bob.cathy@leetcode.com",
            "testemail+david@lee.tcode.com"
        };
        System.out.println("Test Case 1:");
        System.out.println("Input: " + String.join(", ", emails1));
        System.out.println("Expected Output: 2");
        System.out.println("Actual Output: " + solution.numUniqueEmails(emails1));
        System.out.println();
        
        // Test Case 2
        String[] emails2 = {
            "a@leetcode.com",
            "b@leetcode.com",
            "c@leetcode.com"
        };
        System.out.println("Test Case 2:");
        System.out.println("Input: " + String.join(", ", emails2));
        System.out.println("Expected Output: 3");
        System.out.println("Actual Output: " + solution.numUniqueEmails(emails2));
        System.out.println();
        
        // Additional Test Case
        String[] emails3 = {
            "test.email@leetcode.com",
            "test+email@leetcode.com",
            "test.e.mail@leetcode.com"
        };
        System.out.println("Test Case 3:");
        System.out.println("Input: " + String.join(", ", emails3));
        System.out.println("Expected Output: 2");
        System.out.println("Actual Output: " + solution.numUniqueEmails(emails3));

        // Additional Test Case
        String[] emails4 = {
            "test.email+alex@leetcode.com",
            "test.email.leet+alex@code.com"
        };
        System.out.println("Test Case 4:");
        System.out.println("Input: " + String.join(", ", emails4));
        System.out.println("Expected Output: 2");
        System.out.println("Actual Output: " + solution.numUniqueEmails(emails4));
    }
}