class Solution {
    public int findMiddleIndex(int[] nums) {
        
        int totSum=0, leftSum=0;

        for(int n: nums)
        {
            totSum+=n;
        }

        for(int i=0; i<nums.length; i++)
        {
            int rightSum=totSum-leftSum-nums[i];

            if(leftSum==rightSum)
            return i;

            leftSum+=nums[i];
        }
        return -1;
    }
}