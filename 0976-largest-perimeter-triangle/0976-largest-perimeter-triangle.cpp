//Remember we need to make sure the third side should be always less than the sum of the other two sides.

class Solution {
public:
    int largestPerimeter(vector<int>& nums) {
        
        sort(nums.begin(), nums.end());
        int j=nums.size()-2, k=nums.size()-3;
        for (int i=nums.size()-1; i>1; --i) {
            if (nums[i]<nums[j]+nums[k]) return nums[i]+nums[j]+nums[k];
            else j--; k--;
        }

        return 0;
    }
};