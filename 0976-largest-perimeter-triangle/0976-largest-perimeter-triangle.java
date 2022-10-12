class Solution {
    public int largestPerimeter(int[] nums) { // for example nums = [2,1,2]
        int n=nums.length; // length = 3 (0-index, 1-index, 2-index)
        Arrays.sort(nums);  // nums = [1,2,2] (sorting)
        for(int i=n-1; i>1; i--) 
            // i= n-1 (3-1) OR i = [2,2,1](2-index, 1-index, 0-index)
        {
            if(nums[i]<nums[i-1]+nums[i-2])
                // nums[2] < nums[1]+nums[0] OR 2 < 2+1 OR 2<3 condition is true 
            return nums[i]+nums[i-1]+nums[i-2];
            // and return nums[2]+nums[2-1]+nums[2-2]
            // nums[2]+nums[1]+nums[0] OR 2+2+1 = 5
        }
        // If condition is false ten return 0.
        return 0;
        
    }
}
