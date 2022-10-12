/**
 * @param {number[]} nums
 * @return {number}
 */
var largestPerimeter = function(nums) {
    nums.sort((a, b) => b - a);
    let i = 0, j = 1, k = 2;

    while (k < nums.length) {
        if (nums[i] < nums[k] + nums[j]) return nums[i] + nums[k] + nums[j];
        i++, j++, k++;
    }

    return 0;
};