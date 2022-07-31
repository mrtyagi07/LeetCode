class Solution {
    public int majorityElement(int[] nums) { 
        int count = 0;
        int major = 0;
        
        for (int curr : nums) {
            if (count <= 0) {
                major = curr;
            }
            if (major == curr){
                count++;
            } else {
                count--;
            }
        }
        return major;       
    }
}