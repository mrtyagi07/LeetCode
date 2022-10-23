/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findErrorNums = function(nums) {
    let repeated, missing;
    for(let i=0; i<nums.length; i++){
        if(nums[Math.abs(nums[i])-1]<0){
            repeated = Math.abs(nums[i]);
        } else {
            nums[Math.abs(nums[i])-1] *= -1;
        }
    }
    for(let i=0; i<nums.length; i++){
        if(nums[i]>0){
            missing = i+1;
        }
    }
    return [repeated, missing];
};