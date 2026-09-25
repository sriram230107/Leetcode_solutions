class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int arr[]=new int[nums.length];
        int count=0;
        int val=1;
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]==0)
           {
            count++;
           }
           else
           {
            val*=nums[i];
           }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(count>1)
            {
                Arrays.fill(arr,0);
            }
            else
            {
                if(count==1)
                {
                    if(nums[i]!=0)
                    {
                        arr[i]=0;
                    }
                    else
                    {
                        arr[i]=val;
                    }
                }
                else{
                if(nums[i]==0)
                {
                    arr[i]=val;
                }
                else
                {
                    arr[i]=val/nums[i];
                }
                }
            }
        }
       
        return arr;
    }
}