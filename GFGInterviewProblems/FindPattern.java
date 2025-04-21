import java.util.ArrayList;

class FindPattern {
    public ArrayList<Integer> printPat(int n) {
        // This was my first attempt and I missed the borders in the second loop
        // write code here
        // ArrayList<Integer> outputList = new ArrayList<>();
       
        //     for ( int i=n; i>0; i-- ){
        //         // for 3 it should print the whole numbers 3 times 
        //         for ( int numberCounter = i; i>0; numberCounter-- ){
        //             for ( int j=0; j<i; j++ ){
        //             outputList.add(numberCounter);
        //             }
        //         }
                
        //         outputList.add(-1);
        //     }
           
            
        
        // return outputList;
         ArrayList<Integer> outputList = new ArrayList<>();
        
        for (int i = n; i > 0; i--) {
            for (int number = n; number > 0; number--) {
                for (int j = 0; j < i; j++) {
                    outputList.add(number);
                }
            }
            outputList.add(-1);
        }
        
        return outputList;
    }  
}