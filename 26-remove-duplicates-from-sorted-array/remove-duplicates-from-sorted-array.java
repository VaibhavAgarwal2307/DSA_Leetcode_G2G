class Solution {
    public int removeDuplicates(int[] nums) {

        int l=nums.length;

        Set<Integer> set=new HashSet<>();
int i=0;
       for(int n: nums)
       {
        if(set.contains(n))
        continue;
        else
        {
            set.add(n);
            nums[i]=n; 
            i++;
        }
       }
return i;
        
    }
}