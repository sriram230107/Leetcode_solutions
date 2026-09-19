class Solution {
    public void reverseString(char[] s) {
        int a=s.length;
        int j=a-1;
        for(int i=0;i<a;i++)
        {
            if(i<j)
            {
                char temp=s[i];
                s[i]=s[j];
                s[j]=temp;
            }
            j--;
        }
    }
}