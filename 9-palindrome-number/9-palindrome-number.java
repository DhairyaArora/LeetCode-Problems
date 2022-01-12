class Solution {
    public boolean isPalindrome(int x) {
        String a=String.valueOf(x);
        String y="";
        for(int i=0;i<a.length();i++){
            y=String.valueOf(a.charAt(i))+y;
        }
        if(a.equals(y))
            return true;
        else
            return false;
        
    }
}