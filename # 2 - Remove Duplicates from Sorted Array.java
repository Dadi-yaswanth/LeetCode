class Solution {
    public int removeDuplicates(int[] nums) {
        int len  = nums.length;
        //if(len ==1){return len;}
        int count = 1;
        int current = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i]!=current){
                current = nums[i];
                nums[count++] = nums[i];
            }

        }
        return count;
        
    }
}
