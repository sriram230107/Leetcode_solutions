class Solution {
    public boolean canConstruct(String rn, String ma) {
        char arr1[]=rn.toCharArray();
        char arr2[]=ma.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int val=0;
        for(int i=0;i<arr2.length && val<arr1.length;i++)
        {
            if(arr1[val]==arr2[i])
            {
                val++;
            }

        }
        if(val==rn.length())
        {
            return true;
        }
        return false;
        
    }
}