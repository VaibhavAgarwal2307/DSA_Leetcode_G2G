class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int freq1[]= new int[26];
        int freq2[]= new int[26];

        int left=0;

        for(int right=0; right<s1.length(); right++)
        {
        freq1[s1.charAt(right)-'a']++;
        }

        for(int right=0; right<s2.length(); right++)
        {
            freq2[s2.charAt(right)-'a']++;

            if(right-left+1==s1.length())
            {
                if(Arrays.equals(freq1, freq2))
                return true;

                else 
                {
                    freq2[s2.charAt(left)-'a']--;
                     left++;
                }
            }
        }
        return false;
    }
}