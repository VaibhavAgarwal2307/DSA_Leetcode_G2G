class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        
        int max=1, c=1, k=1;

        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[i]>nums[i+1])
            {
                k=1;
                c++;
                max=Math.max(max, c);
            }
            else
            if(nums[i]<nums[i+1])
            {
                c=1;
                k++;
                max=Math.max(k, max);
            }

            else {
                c=1;
                k=1;
            }
        }
        return max;
    }
}