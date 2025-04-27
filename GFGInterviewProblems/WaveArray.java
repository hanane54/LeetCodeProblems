// fixed from first attempt
// can be found on GFG: https://www.geeksforgeeks.org/problems/wave-array-1587115621/1
class WaveArray {
    public static void convertToWave(int[] arr) {
        // code here
        int n = arr.length;
        for (int i = 0; i < n - 1; i += 2) { 
            if (i + 1 < n) {
                int tempValue = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tempValue;
            }
        }
    }

    // Added main method for testing
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        convertToWave(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
