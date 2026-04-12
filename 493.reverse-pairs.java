/*
 * @lc app=leetcode id=493 lang=java
 *
 * [493] Reverse Pairs
 */

// @lc code=start
class Solution {
    public int reversePairs(int[] nums) {
        // BRUTE FORCE
        // int n = nums.length;
        // int revpairs = 0;
        // for (int i = 0; i < n; i++) {
        // long numi = nums[i];
        // for (int j = i + 1; j < n; j++) {
        // if (numi > 2 * (long)nums[j]) {
        // revpairs++;
        // }
        // }
        // }

        // return mergeSort(nums, 0, nums.length - 1);
        return mergeSort2(nums, 0, nums.length - 1);
        

    }

    private static int mergeSort2(int[] nums, int low, int high) {
        if (low >= high) {
            return 0;
        }
        int mid = low + (high - low) / 2;
        int count = 0;
        count += mergeSort2(nums, low, mid);
        count += mergeSort2(nums, mid + 1, high);
        count += merge2(nums, low, mid, high);
        return count;

    }

    private static int merge2(int[] nums, int low, int mid, int high) {
        int count = 0;
        int right = mid + 1;
        for (int i = low; i <= mid; i++) {
            while (right <= high && (long) nums[i] > 2 * (long) nums[right]) {
                right++;
            }
            count += right - (mid + 1);
        }
        int[] temp = new int[high - low + 1];
        int left = low;
        right = mid + 1;
        int k = 0;

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp[k] = nums[left];
                k++;
                left++;
            } else {
                temp[k] = nums[right];
                k++;
                right++;
            }

        }
        while (left <= mid) {
            temp[k] = nums[left];
            k++;
            left++;
        }
        while (right <= high) {
            temp[k] = nums[right];
            k++;
            right++;
        }

        for (int i = 0; i < temp.length; i++) {
            nums[low + i] = temp[i];
        }

        return count;

    }

    private static int mergeSort(int[] nums, int low, int high) {
        if (low >= high) {
            return 0;
        }
        int mid = (high - low) / 2 + low;
        int count = 0;
        count += mergeSort(nums, low, mid);
        count += mergeSort(nums, mid + 1, high);
        count += merge(nums, low, mid, high);
        return count;

    }

    private static int merge(int[] nums, int low, int mid, int high) {
        int count = 0;
        int right = mid + 1;
        for (int i = low; i <= mid; i++) {
            while (right <= high && (long) nums[i] > 2 * (long) nums[right]) {
                right++;
            }
            count += (right - (mid + 1));
        }
        int[] temp = new int[high - low + 1];
        int left = low;
        right = mid + 1;
        int k = 0;
        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp[k++] = nums[left++];
            } else {
                temp[k++] = nums[right++];
            }
        }
        while (left <= mid)
            temp[k++] = nums[left++];
        while (right <= high)
            temp[k++] = nums[right++];

        for (int i = 0; i < temp.length; i++) {
            nums[low + i] = temp[i];
        }
        return count;
    }
}
// @lc code=end
