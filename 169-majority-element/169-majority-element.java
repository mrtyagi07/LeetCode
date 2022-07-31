// class Solution {
//     public int majorityElement(int[] nums) { 
//         int count = 0;
//         int major = 0;
        
//         for (int curr : nums) {
//             if (count <= 0) {
//                 major = curr;
//             }
//             if (major == curr){
//                 count++;
//             } else {
//                 count--;
//             }
//         }
//         return major;       
//     }
// }

// public class Solution {
//     public int majorityElement(int[] num) {

//         int major=num[0], count = 1;
//         for(int i=1; i<num.length;i++){
//             if(count==0){
//                 count++;
//                 major=num[i];
//             }else if(major==num[i]){
//                 count++;
//             }else count--;
            
//         }
//         return major;
//     }
// }

class Solution {
    public int majorityElement(int[] nums) {
     int number=nums[0];
	int count =1;

	for(int i=1;i<nums.length;i++){
		if(nums[i]==number){
			count++;
		}
		else if(nums[i]!=number && count>0){
			count--;
		}else if(count<=0){
			number= nums[i];
			count=1;
		}
	}

	return number;
        }
    }
