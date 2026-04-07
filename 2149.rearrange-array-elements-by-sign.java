
/*
 * @lc app=leetcode id=2149 lang=java
 *
 * [2149] Rearrange Array Elements by Sign
 */
import java.util.*;

// @lc code=start
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                pos.add(nums[i]);
            } else {
                neg.add(nums[i]);
            }
        }
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n / 2 || j < n / 2) {
            if (i == 0 && j == 0) {
                nums[k] = pos.get(0);
                i++;

            } else if (i != j) {
                nums[k] = neg.get(j);
                j++;

            } else {
                nums[k] = pos.get(i);
                i++;

            }
            k++;

        }

        return nums;

    }
}
// @lc code=end
