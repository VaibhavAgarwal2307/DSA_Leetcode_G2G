class Solution {
    public int minMoves(int[] nums) {
        
        Arrays.sort(nums);

        int target=nums[nums.length-1], k=0;

        for(int i=0; i<nums.length-1; i++)
        {
            while(nums[i]<target)
            {
                nums[i]++;
                k++;
            }
        }
        return k;
    }
}