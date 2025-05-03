// can be found at https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
// resolved from the first submission

import java.util.ArrayList;

public class ArrayLeaders {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        int len = arr.length;
        for ( int i=0; i<len ; i++ ){
            boolean flag=true;
            for ( int j = i+1; j<len; j++ ){
                if ( arr[i] < arr[j] ){
                    flag=false;
                    break;
                }
                
            }
            if ( flag ) result.add( arr[i] );
        }
        
        return result;
        
    }
}
