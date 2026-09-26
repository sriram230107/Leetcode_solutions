class Solution {
    public int[][] merge(int[][] inter) {
        List<int[]> res = new ArrayList<>();
        Arrays.sort(inter,(a, b)->a[0]-b[0]);
        res.add(inter[0]);
        int s = 0;
        for(int i=0; i <inter.length - 1; i++)
        {
            int ns = inter[i + 1][0];
            int ne = inter[i + 1][1];
            int ce = res.get(s)[1];
            if(ce >= ns)
            {
                res.get(s)[1]=Math.max(ce, ne);
            }
            else
            {
                res.add(inter[i+1]);
                s++;
            }
        }
        int arr[][]=new int[res.size()][2];
        for(int i=0;i<res.size();i++)
        {
            arr[i]=res.get(i);
        }
        return arr;
    }
}