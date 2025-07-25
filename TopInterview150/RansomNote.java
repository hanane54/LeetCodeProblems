package TopInterview150;

import java.util.HashMap;
import java.util.Map;

class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineCount = new HashMap<Character, Integer>();
        for ( char character : magazine.toCharArray() ){
            Integer characterCount = magazineCount.get(character); 
            if ( characterCount == null ){
                characterCount = 0;
            }
            magazineCount.put( character, characterCount + 1 );
        }

        Map<Character, Integer> ransomCount = new HashMap<Character, Integer>();
        for ( char character : ransomNote.toCharArray() ){
            Integer characterCount = ransomCount.get(character); 
            if ( characterCount == null ){
                characterCount = 0;
            }
            ransomCount.put( character, characterCount + 1 );
        }

        for ( char key : ransomCount.keySet() ){
            if ( !magazineCount.containsKey(key) || ransomCount.get(key)>magazineCount.get(key)  ){
                return false;
            }
        }
        return true; 

        


    }
}