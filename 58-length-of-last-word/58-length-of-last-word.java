class Solution {
    public int lengthOfLastWord(String s) {
    int len=0;
    for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i)==' '){
            //If it is not a trailing space, return the length.
           if(len!=0) return len;
        }else{
           len++;
        }
    }
    return len;
    }
    }
