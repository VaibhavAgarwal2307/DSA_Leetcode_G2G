class Solution {
    public int minMoves(int[] nums) {
        
        int max=nums[0], total=0;

        for(int num: nums)
        {
            max=Math.max(max, num);
        }

        for(int num: nums)
        total+=max-num;

        return total;
    }
}