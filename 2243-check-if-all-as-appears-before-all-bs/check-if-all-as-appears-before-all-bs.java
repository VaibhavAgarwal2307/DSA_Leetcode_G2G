class Solution {
    public boolean checkString(String s) {
        
        boolean flag=true;
        int k=0;
        for(char ch: s.toCharArray())
        {
            if(ch=='b')
            k=1;

            if(ch=='a' && k==1)
            flag=false;
        }

        return flag;
    }
}