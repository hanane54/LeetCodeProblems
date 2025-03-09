package HackeRank;
import java.util.*;

public class BillDivision {
    
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int totalCost = 0;
        
        for (int item : bill) {
            totalCost += item;
        }

        int annaShare = (totalCost - bill.get(k)) / 2;
        
        if (annaShare == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - annaShare);
        }
    }

    public static void main(String[] args) {
        // Hardcoded inputs
        List<Integer> bill = Arrays.asList(3, 10, 2, 9); // Prices of items
        int k = 1;  // Index of item Anna didn't eat
        int b = 12; // Amount Brian charged Anna

        // Call the function with hardcoded values
        bonAppetit(bill, k, b);
    }
}
