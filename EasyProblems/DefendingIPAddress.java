class DefendingIPAddress {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
    public static void main(String[] args) {
    DefendingIPAddress solution = new DefendingIPAddress();
    
    // Test Case 1
    String address1 = "1.1.1.1";
    System.out.println("Test Case 1:");
    System.out.println("Input: address = \"" + address1 + "\"");
    System.out.println("Output: \"" + solution.defangIPaddr(address1) + "\"");
    
    // Test Case 2
    System.out.println("\nTest Case 2:");
    String address2 = "255.100.50.0";
    System.out.println("Input: address = \"" + address2 + "\"");
    System.out.println("Output: \"" + solution.defangIPaddr(address2) + "\"");
    
    // Additional test case with another valid IPv4 address
    System.out.println("\nTest Case 3:");
    String address3 = "192.168.1.1";
    System.out.println("Input: address = \"" + address3 + "\"");
    System.out.println("Output: \"" + solution.defangIPaddr(address3) + "\"");
}
}