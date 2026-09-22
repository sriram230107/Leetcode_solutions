class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> ans=new ArrayList<>();
        for(int i=0;i<candies.length;i++)
        {
            int count=0;
            int a=candies[i]+extraCandies;
            for(int j=0;j<candies.length;j++)
            {
                if(a<candies[j])
                {
                    ans.add(false);
                    count=1;
                    break;
                }
            }
            if(count==0)
            {
                ans.add(true);
            }

        }
        return ans;
        
    }
}