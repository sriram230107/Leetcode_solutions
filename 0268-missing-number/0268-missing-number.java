class Solution {
    public int missingNumber(int[] nums) {

        int i=0;
        int a=nums.length;
        int ip[]=new int[a+1];
        Arrays.fill(ip,-1);

       for(int l:nums)
       {
        ip[l]=l;
        
       }
       while(i<a)
       {
        if(ip[i]!=i++)
        {
            return i-1;
        }
       }

       return a;
        
    }
}