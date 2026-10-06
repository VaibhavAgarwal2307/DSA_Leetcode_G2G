class Solution {
    public int countGoodSubstrings(String s) {
        
        List<Character> list=new ArrayList<>();

        int left=0, c=0;

        for(int right=0; right<s.length(); right++)
        {
            if(list.contains(s.charAt(right)))
            {
                while(list.contains(s.charAt(right)))
                {
                    list.remove(Character.valueOf(s.charAt(left)));
                    left++;
                }
            }
            
            list.add(s.charAt(right));
            if(right-left+1==3)
            {
            c++;
            list.remove(Character.valueOf(s.charAt(left)));
            left++;
            }
        }

        return c;
    }
}