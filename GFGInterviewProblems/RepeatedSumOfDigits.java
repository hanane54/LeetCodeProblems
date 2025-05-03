// solved from first iteration
// can be found on GeeksforGeeks https://www.geeksforgeeks.org/problems/repeated-sum-of-digits3955/1
package GFGInterviewProblems;

public class RepeatedSumOfDigits {
    static int repeatedSumOfDigits(int N) {
        if (N < 10) return N;
    
        int digitSum = 0;
        while (N > 0) {
            digitSum += N % 10;
            N /= 10;
        }
    
        return repeatedSumOfDigits(digitSum);
            
        	
    } 
}
