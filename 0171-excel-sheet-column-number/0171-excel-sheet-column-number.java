class Solution {
    public int titleToNumber(String co) {

        int ans=0;
        HashMap<Character ,Integer> map=new HashMap<>();
        for(int i=1;i<27;i++)
        {
            map.put((char) (65+i-1),i);

        }
        int it=0;
        for(int i=co.length()-1;i>=0;i--)
        {
            char h=co.charAt(i);
            if(it==0)
            {
                ans= map.get(h);
                it++;
            }
            else if(it>=1)
            {
                ans+=Math.pow(26,it)*map.get(h);
                it++;
            }
            
        }

        return ans;
        
    }
}