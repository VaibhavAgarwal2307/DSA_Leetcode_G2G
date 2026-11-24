class Solution {
    public int firstUniqChar(String s) {

       Map<Character, Integer> map=new LinkedHashMap<>();
       Set<Character> set=new LinkedHashSet<>();

       for(char ch: s.toCharArray())
       {
        map.put(ch, map.getOrDefault(ch,0)+1);
       }

       for(Map.Entry<Character, Integer> entry: map.entrySet())
       {
        if(entry.getValue()==1)
        {
            set.add(entry.getKey());
        }
       }
       for(char ans: set)
       return s.indexOf(ans);

       return -1;
        
    }
}