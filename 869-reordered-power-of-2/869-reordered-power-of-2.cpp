class Solution {
public:
    bool reorderedPowerOf2(int n) {
string str = to_string(n);
sort(str.begin(), str.end());
int k =30;
int i = 0;
while(k--){
	int num = (1<<i);
	i++;
	string nums = to_string(num);
	sort(nums.begin(), nums.end());
	if(str == nums){
		return true;
	}
}return false;
 }
};