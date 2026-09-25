class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int arr[]=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<k;i++)
        {
            int max = Integer.MIN_VALUE;
            for(int j=0;j<nums.length;j++)
            {
                if(map.containsKey(nums[j]) && max < map.get(nums[j]))
                {
                    max = map.get(nums[j]);
                    arr[i]=nums[j];
                }
            }
            map.remove(arr[i]);

        }
        
        return arr;
    }
}