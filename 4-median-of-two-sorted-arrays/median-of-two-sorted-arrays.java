class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        int i=0;
        double ans;
        int len=len1+len2;
        int res[]=new int[len];
        
        for( i=0; i<len1;i++)
        {
       res[i]=nums1[i];
        }
        for(int j=0; j<len2; j++)
        {
            res[i]=nums2[j];
            i++;
        }
        Arrays.sort(res);
        if(len%2!=0)
        {
            double sol=res[len/2];
            return sol;
        }
        
        else{
       ans=(res[(len-1)/2] + res[len/2])/2.0;
        }
        return ans;
        
    }
}