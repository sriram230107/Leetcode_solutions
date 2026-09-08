class Solution {
    public String longestCommonPrefix(String[] strs) {

        int i=-1;
        int count =0;
        outerLoop:
        for(int r=0;r<strs[0].length();r++)
        {
            i++;
            char a=strs[0].charAt(i);
            for(String str : strs)
            {
                if(!(i<str.length()) || !(str.charAt(i)==a))
                {
                    break outerLoop;
                }
            }
            count++;
        }
        return strs[0].substring(0,count); 
        
    }
}