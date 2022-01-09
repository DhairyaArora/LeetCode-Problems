class Solution {
    public boolean searchMatrix(int[][] mat, int X) {
        boolean ans=false;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==X)
                    {
                        ans=true;
                        return ans;
                       
                    }
            }
            if(ans==true)
                break;
        }
        return ans;
    }
    }
