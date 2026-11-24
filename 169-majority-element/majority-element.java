class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer, Integer> map=new HashMap<>();

        int max=0;

        for(int n: nums)
        {
            map.put(n, map.getOrDefault(n,0)+1);
        }

      for(int n: map.values())
      {
        max=Math.max(max, n);
      }

      for(int k: map.keySet())
      {
        if(map.get(k)==max)
        return k;
      }

      return -1;
    }
}