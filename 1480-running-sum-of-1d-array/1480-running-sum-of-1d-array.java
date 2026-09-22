class Solution {
    public int[] runningSum(int[] nums) {
        int rn=0;
        for(int i=0;i<nums.length;i++)
        {
            rn+=nums[i];
            nums[i]=rn;
        }
    return nums;
    }
}