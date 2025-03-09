package HackeRank;
public class GetMoneySpent {
    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        int max = -1;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                int cost = keyboards[i] + drives[j];
                if (cost <= b && cost > max) {
                    max = cost;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Hardcoded values
        int b = 10;  // Budget
        int[] keyboards = {3, 1};  // Keyboard prices
        int[] drives = {5, 2, 8};  // USB drive prices

        int moneySpent = getMoneySpent(keyboards, drives, b);
        System.out.println(moneySpent); // Expected output: 9
    }
}
