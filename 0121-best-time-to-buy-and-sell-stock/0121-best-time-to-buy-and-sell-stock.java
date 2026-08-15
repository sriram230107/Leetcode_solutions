class Solution {
    public int maxProfit(int[] prices) {
        int l=prices.length;
        int cheap=prices[0];
        int profitA=0;
        int profitB=0;
        for(int i=0;i<l;i++)
        {
           if(prices[i]<cheap)
           {
            cheap=prices[i];
           }
           profitA=prices[i]-cheap;
           if(profitA>profitB)
           {
            profitB=profitA;
           }

        }
        return profitB;
        
    }
}