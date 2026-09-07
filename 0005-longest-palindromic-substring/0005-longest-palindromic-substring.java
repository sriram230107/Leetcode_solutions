class Solution {
    public String longestPalindrome(String s) {
        int l=0;
        int m=1;
        int len=0;
        int tempa=0,tempb=1;

        while(l<s.length())
        {
            m=l+1;

            while(m<=s.length())
            {
                if(palindrome(s.substring(l,m)))
                {
                    if(m-l>len)
                    {
                        len=m-l;
                        tempa=l;
                        tempb=m;
                    }
                }

                m++;
            }

            l++;
        }

        return s.substring(tempa,tempb);
    }

    public boolean palindrome(String a)
    {
        int i=0;
        int j=a.length()-1;

        while(i<j)
        {
            if(a.charAt(i)!=a.charAt(j))
            {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}