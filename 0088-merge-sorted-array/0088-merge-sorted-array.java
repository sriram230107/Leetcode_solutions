class Solution {
    public void merge(int[] n1, int m, int[] n2, int n) {

        for(int i=0;i<n;i++)
        {
            n1[m++]=n2[i];
        }

        
        int a=0;
        while(a<n1.length-1)
        {
            int i=0;
            while(i<n1.length-1)
            {
                if( n1[i]>n1[i+1] )
                {
                    int temp=n1[i+1];
                    n1[i+1]=n1[i];
                    n1[i]=temp;
                    i++;
                }
                else{
                    i++;
                }
            }
            a++;
        }


        
    }
}