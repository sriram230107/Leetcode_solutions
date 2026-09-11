class Solution {
    public int firstMissingPositive(int[] nums) {

        int a=nums.length;
        int i=0;
        while(i<a)
        {
            while(nums[i]>0 && nums[i]<=a && nums[nums[i]-1]!=nums[i])
            {
                int temp=nums[i];
                nums[i]=nums[temp-1];
                nums[temp-1]=temp;
            }
            i++;
        }
        int m=1;
        for(int l=0;l<a;l++)
        {
            if(nums[l]==m)
            {
                m++;
            }
            else 
            {
                return m;
            }
        }

        return nums.length+1;
    }
}