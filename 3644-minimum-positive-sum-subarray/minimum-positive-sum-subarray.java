class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int minSum=Integer.MAX_VALUE;

       for(int left=0; left<nums.size(); left++)
       {
        int s=0;
        for(int right=left; right<nums.size(); right++)
        {
            s+=nums.get(right);

            if(s>0 && (right-left+1)>=l && (right-left+1)<=r)
            {
                minSum=Math.min(minSum, s);
            }
            if(right-left+1==r)
            break;
        }
       }

        return minSum==Integer.MAX_VALUE ? -1 : minSum;
        
    }
}