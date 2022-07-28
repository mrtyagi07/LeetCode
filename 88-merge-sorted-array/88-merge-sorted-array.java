class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
if (n == 0) {
            return;
        }
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }
        while (m > 0 && n > 0) {
            if (nums1[m - 1] >= nums2[n - 1]) {
                nums1[m + n - 1] = nums1[m - 1];
                m--;
            } else {
                nums1[m + n - 1] = nums2[n - 1];
                n--;
            }
        }
        while (n > 0) {
            nums1[n - 1] = nums2[n - 1];
            n--;
        }
 }
}