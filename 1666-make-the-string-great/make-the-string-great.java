class Solution {
    public String makeGood(String s) {

        int l=s.length()+1;
        String sub="";
        
        while(s.length()<l)
        {
            l=s.length();
        for(int i=0; i<s.length()-1; i++)
        {
            if(Math.abs(s.charAt(i)-s.charAt(i+1))==32)
            {
                sub="" + s.charAt(i)+s.charAt(i+1);
                s=s.replace(sub,"");
                break;
            }

        }
        }
        return s;
    }
}