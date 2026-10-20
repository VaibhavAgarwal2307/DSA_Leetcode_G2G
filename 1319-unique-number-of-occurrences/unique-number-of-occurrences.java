class Solution {
    public boolean uniqueOccurrences(int[] arr) {
    
   Map<Integer, Long> mp=Arrays.stream(arr).boxed().collect(Collectors.groupingBy(n->n, Collectors.counting()));

   return mp.values().stream().distinct().count()==mp.size();

    }
}