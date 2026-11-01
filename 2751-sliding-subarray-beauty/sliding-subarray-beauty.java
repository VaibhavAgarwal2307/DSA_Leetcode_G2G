class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {

        int left=0, min=Integer.MIN_VALUE;
        int freq[]=new int[101];

        int res[]= new int[nums.length-k+1];

        for(int right=0; right<nums.length; right++)
        {
            freq[nums[right]+50]++;
            if(right-left+1==k)
            {
            int c=0, beauty=0;

            for(int i=0; i<50; i++)
            {
                c+=freq[i];
                if(c>=x)
                {
                    beauty=i-50;
                    break;
                }
            }

            res[left]=beauty;
         freq[nums[left]+50]--;
         left++;
            }
        }
        return res;
    }
}