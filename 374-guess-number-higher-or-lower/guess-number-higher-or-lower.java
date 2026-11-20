/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left=1, right=n, mid=0, result=0;

        while(left<=right)
        {
            mid=left+ (right-left)/2;

            result=guess(mid);
            if(result==-1)
            {
                right=mid-1;
            }
            
            else if(result==1)
            left=mid+1;
           
           else
            return mid;
        }
        return -1;
    }
}