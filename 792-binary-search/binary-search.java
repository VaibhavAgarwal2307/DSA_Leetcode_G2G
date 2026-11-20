class Solution {
    public int search(int[] nums, int target) {
        
        int left=0, right=nums.length-1, mid=0;

        while(left<=right)
        {
            mid=(left+right)/2;
            if(nums[mid]<target)
            {
                left=mid+1;
            }

            else if(nums[mid]>target)
            {
                right=mid-1;  
            }          
                else if(nums[mid]==target)
               return mid; 

        }

        return -1;
        }
        
    }
