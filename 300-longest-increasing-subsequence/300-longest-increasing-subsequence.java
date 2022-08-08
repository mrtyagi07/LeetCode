class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0||nums==null) return 0;
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        int anchor=0;
        for(int i=1;i<nums.length;i++){
            int index=binarySearch(dp,anchor,nums[i]);
            if(index==anchor&&nums[i]>dp[anchor]){
                dp[++anchor]=nums[i];
            }
            else{
                dp[index]=nums[i];
            }
        }
        return anchor+1;
    }
    public int binarySearch(int[]nums,int anchor,int target){
        int l=0,r=anchor;
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]<target) l=mid+1;
            else r=mid;
        }
        return l;
    }
    
}