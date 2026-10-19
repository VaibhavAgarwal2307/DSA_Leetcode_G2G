class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> list=new ArrayList<>();

        for(int i=0; i<nums.length-1; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[j]<nums[i])
                {
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
        }

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==target)
            list.add(i);
        }

        return list;
    }
}