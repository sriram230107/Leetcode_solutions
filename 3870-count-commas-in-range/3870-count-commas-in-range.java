class Solution {
    public int countCommas(int n) {
        int i=0;
        int count=0;
        if(n>999)
        {
            for(int s=1000;s<=n;s++)
            {
                if(String.valueOf(s).length()==6)
                {
                    count++;

                }
                else if(String.valueOf(s).length()==5)
                {
                    count++;
                }
                else if(String.valueOf(s).length()==4)
                {
                    count++;
                }
            }
        }
        return count;
        
    }
}