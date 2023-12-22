class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> interval = new ArrayList<>();

        //iterate through the nums
        for(int i=0; i<nums.length; i++){
            int start = nums[i];
        //so here, think of it as a 2D for loop, but in this case, increment i
        //inside the while loop as loong as i+1 == [i]+1, meaning next one is 1 greater than previous one. Also, while until the length of the nums.
        while((i+1<nums.length && nums[i]+1 == nums[i+1])  ){
                i++;
        }
        //So now, we came across with the breaking point. Use pointer(Start) to mark the range. If the pointer is not equal to num[i], then, return the range (start -> num[i]) else (if the pointer is equal to num[i]) start is the sole range
        if(start != nums[i]){
            interval.add(""+start+"->"+nums[i]);
        }else{
            interval.add(""+start);
        }
        } return interval;
    }
}