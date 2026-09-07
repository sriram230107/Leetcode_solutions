class Solution {
    public int maxArea(int[] height) {

        int a=0;
        int h=0;
        int b=height.length-1;
        int h1=0;
        while(a<b)
        {
            int temp;
            if(height[a]>=height[b])
            {
                temp=height[b];
            }
            else
            {
                temp=height[a];
            }
            h1=(b-a)*temp;
            h=Math.max(h,h1);
            if(height[a]>=height[b])
            {
                b--;
            }
            else
            {
                a++;
            }
        }
        return h;
        
    }
}