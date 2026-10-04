class Solution {
    public int maxVowels(String s, int k) {
        
        int max=0, left=0, c=0, l=0;

        for(int right=0; right<s.length(); right++)
        {
            l++;
            if(s.charAt(right)=='a' || s.charAt(right)=='e' || s.charAt(right)=='i' || s.charAt(right)=='o' || s.charAt(right)=='u')
            c++;

            if(l==k)
            {
                max=Math.max(max, c);
                if(s.charAt(left)=='a' || s.charAt(left)=='e' || s.charAt(left)=='i' || s.charAt(left)=='o' || s.charAt(left)=='u')
                {
                    c--;
                }
                l--;
                left++;
            }
        }
        return max;
    }
}