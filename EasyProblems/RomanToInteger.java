import java.util.Map;

class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000);

        int resultInt = 0;
        int stringLength = s.length();
        if ((stringLength >= 1) && (15 >= stringLength)) {
            for (int i = 0; i < stringLength; i++) {
                int current = romanMap.get(s.charAt(i));
                if (i < stringLength-1 && (romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1)))) {
                    resultInt -= current;
                } else {
                    resultInt += current;
                }

            }

        }
        return resultInt;
    }
}