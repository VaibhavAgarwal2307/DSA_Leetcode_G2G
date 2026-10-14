class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int c=0, prod=1, left=0;

        for(int right=0; right<nums.length; right++)
        {
            prod*=nums[right];

             while(prod>=k && left<=right)
            {
                prod/=nums[left];
                left++;
            }

            if(prod<k)
            {
            c+=right-left+1;
            }
         
        }
        return c;
    }
}