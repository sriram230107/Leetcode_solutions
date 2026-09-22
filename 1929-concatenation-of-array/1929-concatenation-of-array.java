class Solution {
    public int[] getConcatenation(int[] nums) {
        int []ans=new int[2*nums.length];
        int n=nums.length;
        System.arraycopy(nums,0,ans,0,nums.length);
        for(int i=0;i<nums.length;i++)
        {
            ans[n++]=nums[i];
        }
        return ans;
    }
}