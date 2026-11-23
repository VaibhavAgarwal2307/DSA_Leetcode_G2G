class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
        return false;

        Map<Character, Integer> map1=new HashMap<>();
        Map<Character, Integer> map2=new HashMap<>();

        for(char ch: s.toCharArray())
        {
            map1.put(ch, map1.getOrDefault(ch,0)+1);
        }

       for(char ch: t.toCharArray())
       {
        map2.put(ch, map2.getOrDefault(ch,0)+1);
       }

       for(Map.Entry<Character, Integer> entry: map1.entrySet())
       {
        if(!map2.containsKey(entry.getKey()))
        return false;

        if(!map2.get(entry.getKey()).equals(entry.getValue()))
        return false;
       }

       return true;
        
    }
}