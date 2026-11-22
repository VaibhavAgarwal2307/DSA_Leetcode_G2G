class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int left=0, min=Integer.MAX_VALUE, s=0;

        for(int right=0; right<nums.length; right++)
        {
         s+=nums[right];

         while(s>=target)
         {
             min=Math.min(min, right-left+1);
             s-=nums[left++];
         }
        }

        return (min==Integer.MAX_VALUE) ? 0 : min;
    }
}