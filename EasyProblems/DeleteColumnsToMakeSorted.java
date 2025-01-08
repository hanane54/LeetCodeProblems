// Runtime 35ms Beats 5.22% 
// Memory 45.58MB Beats 5.74%
public class DeleteColumnsToMakeSorted {
    public int minDeletionSize(String[] strs) {
        int counter = 0;
        for ( int i=0; i<strs[0].length(); i++ ){
            for ( int j=0; j<strs.length-1; j++ ){
                if(  Character.toString(strs[j].charAt(i)).compareTo(Character.toString(strs[j+1].charAt(i))) > 0  ){
                    counter ++;
                    break;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        DeleteColumnsToMakeSorted solution = new DeleteColumnsToMakeSorted();
        
        // Test Case 1
        String[] test1 = {"cba","daf","ghi"};
        System.out.println("Test Case 1:");
        System.out.println("Input: strs = [\"cba\",\"daf\",\"ghi\"]");
        System.out.println("Expected Output: 1");
        System.out.println("Actual Output: " + solution.minDeletionSize(test1));
        System.out.println();
        
        // Test Case 2
        String[] test2 = {"a","b"};
        System.out.println("Test Case 2:");
        System.out.println("Input: strs = [\"a\",\"b\"]");
        System.out.println("Expected Output: 0");
        System.out.println("Actual Output: " + solution.minDeletionSize(test2));
        System.out.println();
        
        // Test Case 3
        String[] test3 = {"zyx","wvu","tsr"};
        System.out.println("Test Case 3:");
        System.out.println("Input: strs = [\"zyx\",\"wvu\",\"tsr\"]");
        System.out.println("Expected Output: 3");
        System.out.println("Actual Output: " + solution.minDeletionSize(test3));
        System.out.println();
        
        // Additional Test Case from description
        String[] test4 = {"abc", "bce", "cae"};
        System.out.println("Additional Test Case:");
        System.out.println("Input: strs = [\"abc\",\"bce\",\"cae\"]");
        System.out.println("Expected Output: 1");
        System.out.println("Actual Output: " + solution.minDeletionSize(test4));
    }
}