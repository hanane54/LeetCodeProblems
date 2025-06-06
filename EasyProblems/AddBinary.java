class AddBinary {
    public String addBinary(String a, String b) {
        int sum = convertToInt(a) + convertToInt(b);
        return convertToBinary(sum);
    }
    public String convertToBinary(int n){
        return Integer.toString(n, 2 ); 
    }
    public int convertToInt(String a){
        return Integer.parseInt(a, 2);
    }
}