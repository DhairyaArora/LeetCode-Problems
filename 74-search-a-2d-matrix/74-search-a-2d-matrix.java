class Solution {
    public boolean searchMatrix(int[][] mat, int X) {
       boolean ans=false;
        int i=0;
        int j=mat[0].length-1;
        while(i<mat.length && j>=0){
            if(mat[i][j]==X)
             {
                 ans=true;
                 break;
             }
             else if(mat[i][j]<X){
                 i++;
             }
             else
                j--;
        }
        return ans;
    }
}