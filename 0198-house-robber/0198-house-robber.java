class Solution {

    public int dp(int i,int[] nums,int[] memo) {
        if(i>=nums.length) {
            return 0;
        }

        if(memo[i]!=-1) {
            return memo[i];
        }

        int rob=nums[i]+dp(i+2,nums,memo);
        int skip=dp(i+1,nums,memo);

        memo[i]=Math.max(rob,skip);

        return memo[i];
    }

    public int rob(int[] nums) {
        int[] memo=new int[nums.length];
        Arrays.fill(memo,-1);

        return dp(0,nums,memo);
    }
}