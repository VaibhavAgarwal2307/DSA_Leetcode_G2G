class Solution {
    public int firstUniqChar(String s) {

        List<Character> list=new ArrayList<>();
        Set<Character> set=new HashSet<>();

        for(char ch: s.toCharArray())
        {
            if(list.contains(ch))
            {
                set.add(ch);
            }
            list.add(ch);
        }

        for(char ch: list)
        {
            if(!set.contains(ch))
            {
               return s.indexOf(ch);
            }
        }

        return -1;
        
    }
}