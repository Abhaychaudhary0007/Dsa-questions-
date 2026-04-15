class Solution {
      static int[] dp;
     public int robhelp(int[] nums , int index ,int[] dp){
            int size=nums.length;
            if(index>=size){
                return 0;
            }
            if(dp[index]!=-1){
                return dp[index];
            }
            int optionA= nums[index]+robhelp(nums,index+2,dp);
            int optionB=robhelp(nums,index+1,dp);

            dp[index]=Math.max(optionA,optionB);
            return dp[index];
        }

    public int rob(int[] nums) {
        int n = nums.length;
        dp=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=-1;
        }
        
       return robhelp(nums,0,dp);
       
        
    }
}