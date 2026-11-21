/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        int left=1, right=n, mid=0, ans=0;

        while(left<=right)
        {
            mid=left+(right-left)/2;

           boolean result=isBadVersion(mid);
            if(result==false)
            {
            left=mid+1;
            }

            else if(result==true)
            {
                ans=mid;
            right=mid-1;
            }
            
        }
      return ans;
    }
}