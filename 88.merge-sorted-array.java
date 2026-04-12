/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int arr1 = m - 1;
        // int arr2 = n - 1;
        // int insert = nums1.length - 1;

        // while (arr1 >= 0 && arr2 >= 0) {
        // if (nums1[arr1] <= nums2[arr2]) {
        // nums1[insert] = nums2[arr2];
        // arr2--;
        // insert--;
        // } else {
        // nums1[insert] = nums1[arr1];
        // arr1--;
        // insert--;
        // }
        // }

        // while (arr2 >= 0) {
        // nums1[insert] = nums2[arr2];
        // arr2--;
        // insert--;
        // }

        int arr1 = m - 1;
        int arr2 = n - 1;
        int insert = m + n - 1;

        while (insert >= 0) {

            if (arr1 >= 0 && arr2 >= 0 && nums1[arr1] >= nums2[arr2]) {
                nums1[insert] = nums1[arr1];
                arr1--;
            } else if (arr2 >= 0 && arr1 >= 0 && nums1[arr1] < nums2[arr2]) {
                nums1[insert] = nums2[arr2];
                arr2--;
            } else if(arr2>=0){
                nums1[insert] = nums2[arr2];
                arr2--;
            }
            insert--;

        }

        // if(arr1!=0){
        // while(arr1>=0){
        // nums1[insert]=nums1[arr1];
        // arr1--;
        // insert--;
        // }
        // }

    }
}
// @lc code=end
