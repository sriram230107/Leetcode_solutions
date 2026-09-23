
class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
        {
            return false;
        }

        char arr1[]=s.toLowerCase().toCharArray();
        char arr2[]=t.toLowerCase().toCharArray();

        for(int i=0;i<arr2.length;i++)
        {
            int found=0;

            for(int j=0;j<arr1.length;j++)
            {
                if(arr2[i]==arr1[j])
                {
                    arr1[j]=' ';
                    found=1;
                    break;
                }
            }

            if(found==0)
            {
                return false;
            }
        }

        return true;
    }
}