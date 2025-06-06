// intuitive solution 
// can be found on https://leetcode.com/problems/add-binary/
// this did not work for large numbders 

// class AddBinary {
//     public String addBinary(String a, String b) {
//         int sum = convertToInt(a) + convertToInt(b);
//         return convertToBinary(sum);
//     }
//     public String convertToBinary(int n){
//         return Integer.toString(n, 2 ); 
//     }
//     public int convertToInt(String a){
//         return Integer.parseInt(a, 2);
//     }
// }
import java.math.BigInteger;


class AddBinary {
    public String addBinary(String a, String b) {
        BigInteger numA = new BigInteger(a, 2);
        BigInteger numB = new BigInteger(b, 2);
        BigInteger sum = numA.add(numB);
        return sum.toString(2);
    }
}