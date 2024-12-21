class FirstStringOccurence {
    public int strStr(String haystack, String needle) {
        if ( needle.length() <= 10000 && 1 <= haystack.length() && haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstStringOccurence solution = new FirstStringOccurence();

        // Test case 1
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        int result1 = solution.strStr(haystack1, needle1);
        System.out.println("Test Case 1 Output: " + result1); // Expected: 0

        // Test case 2
        String haystack2 = "leetcode";
        String needle2 = "leeto";
        int result2 = solution.strStr(haystack2, needle2);
        System.out.println("Test Case 2 Output: " + result2); // Expected: -1

        // Additional test cases
        String haystack3 = "hello";
        String needle3 = "ll";
        int result3 = solution.strStr(haystack3, needle3);
        System.out.println("Test Case 3 Output: " + result3); // Expected: 2

        String haystack4 = "aaaaa";
        String needle4 = "bba";
        int result4 = solution.strStr(haystack4, needle4);
        System.out.println("Test Case 4 Output: " + result4); // Expected: -1
    }
}
