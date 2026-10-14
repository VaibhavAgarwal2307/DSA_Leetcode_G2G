class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int min=Integer.MAX_VALUE, left=0, sum=0;

        for(int right=0; right<nums.length; right++)
        {
         sum+=nums[right];

         while(sum>=target)
         {
            min=Math.min(right-left+1, min);
            sum-=nums[left];
            left++;
         }
        }
        
        if(min==Integer.MAX_VALUE)
        return 0;

        return min;
    }
}