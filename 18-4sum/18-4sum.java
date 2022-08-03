class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if(nums==null|| nums.length<4)
        return res;
        
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-3; i++){
            if(i==0 ||(i>0 && nums[i]!=nums[i-1] && i<nums.length-3) ){ // shift i , becoz we have to ignore duplicates
                
                for(int j=i+1;j<nums.length-2; j++){
                    if(j == i+1 || (j > i+1 && nums[j] != nums[j-1] && j<nums.length-2 )){
                        
                    int lo = j+1;
                    int hi = nums.length-1;
                    long sum = (long)target - (nums[i]+nums[j]);
                    while(lo < hi){
                        if(nums[lo] + nums[hi] == sum){
                            res.add(Arrays.asList(nums[i],nums[j],nums[lo],nums[hi]));
                            
                            while(lo<hi && nums[lo] == nums[lo+1]) lo++; //move lo if duplicates
                            while(lo<hi && nums[hi] == nums[hi-1]) hi--;
                            
                            lo++;
                            hi--;
                            
                            if(lo > hi) break;
                        }
                        if(nums[lo] + nums[hi] < sum)
                            lo++;
                        else if(nums[lo] + nums[hi]  > sum)
                            hi--;
                    }// end of while loop
                }
            }
        }
    }
        
     return res;
    }
}
