class Solution {
    public int maxSubArray(int[] nums) {
        int sum =nums[0];
        int max =nums[0];
        int n=nums.length;
        int temp =0;
        int start =0;
        int end =0;
        for(int i=1;i<n;i++){
            if(nums[i]>sum +nums[i]){
                sum=nums[i];
                temp=i+1;
            }
            else{
                sum+=nums[i];
            }
             if(sum>max){
                max=sum;
                end=i;
                start=temp;
             }

        }
        for(int i=start;i<=end;i++){
            System.out.print(nums[i]+" ");
        }
   return max; }
}