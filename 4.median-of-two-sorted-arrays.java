/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
class Solution {
    public double revision(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            return revision(nums2, nums1);
        }
        int n = nums1.length;
        int m = nums2.length;
        int low = 0;
        int high = n;

        while (low <= high) {
            int cut1 = low + (high - low) / 2;
            int cut2 = ((n + m + 1) / 2) - cut1;

            int l1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int l2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];

            int r1 = (cut1 == n) ? Integer.MAX_VALUE : nums1[cut1];
            int r2 = (cut2 == m) ? Integer.MAX_VALUE :nums2[cut2];

            if(l1<=r2 && l2<=r1){
                if((n+m)%2==0){
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }else{
                    return Math.max(l1,l2);
                }
            }else if(l1>r2){
                high=cut1-1;
            }else{
                low=cut1+1;
            }
        }
        return 0.0;

    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        return revision(nums1, nums2);

        // if (nums1.length > nums2.length) {
        // int[] temp = nums1;
        // nums1 = nums2;
        // nums2 = temp;

        // }
        // int n = nums1.length;
        // int m = nums2.length;

        // int low = 0;
        // int high = n;
        // while (low <= high) {

        // int ele1 = low + (high - low) / 2;
        // int ele2 = (n + m + 1) / 2 - ele1;

        // int l1 = (ele1 == 0) ? Integer.MIN_VALUE : nums1[ele1 - 1];
        // int l2 = (ele2 == 0) ? Integer.MIN_VALUE : nums2[ele2 - 1];

        // int r1 = (ele1 == n) ? Integer.MAX_VALUE : nums1[ele1];
        // int r2 = (ele2 == m) ? Integer.MAX_VALUE : nums2[ele2];

        // if(l1<=r2 && l2<=r1){
        // if((n+m)%2==0){
        // return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
        // }
        // else{
        // return Math.max(l1,l2);
        // }
        // }else if(l1>r2){
        // high= ele1-1;
        // }else{
        // low=ele1+1;
        // }
        // }
        // return 0.0;

    }
}
// @lc code=end
