class Solution {
    public boolean increasingTriplet(int[] nums) {
        int smallValue = Integer.MAX_VALUE;
        int midValue = Integer.MAX_VALUE;

        int len = nums.length;
        if(len<3){return false;}

        for(int num : nums){

            if(num <= smallValue) smallValue = num;
            else if(num > smallValue && num<=midValue) midValue = num;
            else return true;
        }
        return false;
    }
}
