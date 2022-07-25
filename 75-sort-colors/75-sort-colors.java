class Solution {
    public void sortColors(int[] nums) {
     int length = nums.length;
        if(length==0)
         {   return;  }
        int l=0;
		int m=0;
		int h= length-1;
		int temp;
            while(m <= h)
            {
                if(nums[m] == 1)
                    m++;
                else if(nums[m] == 0)
                {
                    temp = nums[l];
                    nums[l] = nums[m];
                    nums[m] = temp;
                    m++;
                    l++;
                }
                else if(nums[m] == 2)
                {                                
                    temp = nums[h];
                    nums[h] = nums[m];
                    nums[m] = temp;
                    h--;
                } 
    }
  }
}