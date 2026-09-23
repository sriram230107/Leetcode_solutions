class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1=word1.length();
        int w2=word2.length();
        int i=0;
        int j=0;
        String mer="";
        while(i<w1 || j<w2)
        {
            
            if(i<w1)
            {
                mer+=word1.charAt(i);
            }
            if(j<w2)
            {
                mer+=word2.charAt(j);   
            }
            i++;
            j++;

        }
        return mer;
    }
}