class Solution {
    public int mySqrt(int x) {

       int left=1, right=x, mid=0, ans=0;

       if(x==0)
       return 0;

       while(left<=right)
       {
        mid=left+(right-left)/2;

        if(mid>x/mid)
        {
            right=mid-1;
        }

        else if(mid<x/mid)
        {
            ans=mid;
            left=mid+1;
        }

        else return mid;
       }

       return ans;
    }
}