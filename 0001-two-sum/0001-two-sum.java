class Solution {
    public int[] twoSum(int[] nums, int target) {
        //hashmap. Iterate through indicies and see if an target - current = index
        //since hashmap has 0(1) when containsKey(), copy the array nums into the hashmap and check if they have the supplementary value to make the target
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            int sup = target - nums[i];
            if(map.containsKey(sup))
                return new int[]{map.get(sup),i};
            map.put(nums[i],i);
        } return new int[]{}; //not found


        
    }
}