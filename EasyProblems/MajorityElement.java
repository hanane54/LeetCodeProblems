class majorityElement {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majority = n / 2;
        int result = 0;
        Map<Integer, Integer> occurences = new HashMap<Integer, Integer>();
        for ( int i = 0 ; i< n ; i++ ){
            // get the occurence of the current element 
            int count = occurences.getOrDefault(nums[i], 0); 
            occurences.put(nums[i], count + 1);
        }

        for (Map.Entry<Integer, Integer> entry : occurences.entrySet()) {
            if (entry.getValue() > majority) {
                // keys.add(entry.getKey());
                result = entry.getKey();
                break;
            }
        }
        return result;
    }

}