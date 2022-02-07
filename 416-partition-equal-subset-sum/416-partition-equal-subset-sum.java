class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int x:nums)
            sum+=x;
        if(sum%2!=0)
            return false;
        else
        {
          
            return equalsum(nums, sum/2);
        }
    }

    public static boolean equalsum(int nums[], int sum){
        boolean t[][]=new boolean[nums.length+1][sum+1];
        for(int i=0;i<nums.length+1;i++){
            t[i][0]=true;
        }
        for(int j=1;j<sum+1;j++){
            t[0][j]=false;
        }
        for(int i=1;i<nums.length+1;i++)
        {
            for(int j=1;j<sum+1;j++){
                if(nums[i-1]<=j)
                    t[i][j]=t[i-1][j-nums[i-1]]||t[i-1][j];
                else
                    t[i][j]=t[i-1][j];
                
            }
        }
        return t[nums.length][sum];
    }
}