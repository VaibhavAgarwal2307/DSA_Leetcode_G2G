class Solution {
    public int countGoodSubstrings(String s) {
        
        List<Character> list=new ArrayList<>();

        int c=0;

        for(int right=0; right<s.length(); right++)
        {
                while(list.contains(s.charAt(right)))
                {
                    list.remove(0);
                }
            
            
            list.add(s.charAt(right));
            if(list.size()==3)
            {
            c++;
            list.remove(0);
            }
        }

        return c;
    }
}