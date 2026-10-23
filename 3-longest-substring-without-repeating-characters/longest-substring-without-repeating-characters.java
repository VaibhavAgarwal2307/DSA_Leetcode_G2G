class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int left = 0, max = 0;

        List<Character> list = new ArrayList<>();

        for (int right = 0; right < s.length(); right++) {
                while (list.contains(s.charAt(right))) {
                    list.remove(0);
                    left++;
                }
            list.add(s.charAt(right));
            max = Math.max(max, list.size());
        }
          return max;
    }
}