class Solution {
    public String restoreString(String s, int[] indices) {
        char l[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            l[indices[i]]=s.charAt(i);
        }
        return String.valueOf(l);
    }
}