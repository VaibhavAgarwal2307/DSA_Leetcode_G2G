class Solution {
    public String makeGood(String s) {

       Stack<Character> stack=new Stack<>();

       stack.push(s.charAt(0));

       for(int i=1; i<s.length(); i++)
       {
        if(!stack.isEmpty() && Math.abs(stack.peek()-s.charAt(i))==32)
        stack.pop();

        else stack.push(s.charAt(i));
       }

       StringBuilder ans=new StringBuilder();
       for(char ch: stack)
       ans.append(ch);

       return ans.toString();
    }
}