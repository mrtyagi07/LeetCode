public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] copyNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copyNums);
        int left = 0, right = copyNums.length - 1;
        int[] indices = new int[2];
        while (left < right) {
            int sum = copyNums[left] + copyNums[right];
            if (sum == target) {
                indices[0] = left;
                indices[1] = right;
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (copyNums[indices[0]] == nums[i]) {
                indices[0] = i;
                break;
            }
        }
        
        for (int i = nums.length - 1; i >= 0; i--) {
            if (copyNums[indices[1]] == nums[i]) {
                indices[1] = i;
                break;
            }
        }
        
        return indices;
    }
}