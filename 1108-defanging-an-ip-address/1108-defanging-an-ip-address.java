class Solution {
    public String defangIPaddr(String add) {
        StringBuilder ans=new StringBuilder(add);
        int i=0;
        while(i<ans.length())
        {
            if(ans.charAt(i)=='.')
            {
                ans.insert(i,'[');
                ans.insert(i+2,']');
                i+=3;
            }
            else
            {
                i++;
            }
        }
        return ans.toString();
        }
}