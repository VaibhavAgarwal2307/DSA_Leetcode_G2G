class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        Map<Character, Integer> map1=new HashMap<>();
        Map<Character, Integer> map2=new HashMap<>();

        for(char ch: magazine.toCharArray())
        {
            map1.put(ch, map1.getOrDefault(ch,0)+1);
        }

        for(char ch: ransomNote.toCharArray())
        {
            map2.put(ch, map2.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character, Integer> entry: map2.entrySet())
        {
          if(!map1.containsKey(entry.getKey()))
          return false;

          if(map1.get(entry.getKey())<entry.getValue())
          return false;
        }

        return true;
    }
}