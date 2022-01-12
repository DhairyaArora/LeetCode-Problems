class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        for(String x:operations){
            if((x.equals("++X")) || (x.equals("X++")))
                ans++;
            else
                ans--;
        }
        return ans;
    }
}