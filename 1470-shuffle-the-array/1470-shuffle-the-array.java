class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []ans=new int[nums.length];
        int a=(nums.length/2);
        int b=0;
        for(int i=0;i<nums.length/2;i++)
        {
            ans[b]=nums[i];
            ans[++b]=nums[a++];
            b++;
        }
        return ans;
    }
}