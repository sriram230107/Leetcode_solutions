class Solution {
    public int maxSubArray(int[] nums) {
        int cm=0;
        int fm=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            cm=Math.max(nums[i], cm + nums[i]);;
            fm=Math.max(fm,cm);;
        }
        return fm;
        
    }
}