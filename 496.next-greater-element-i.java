/*
 * @lc app=leetcode id=496 lang=java
 *
 * [496] Next Greater Element I
 */

// @lc code=start
import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];

        // Map<Integer, Integer> hm = new HashMap<>();
        // for (int i = 0; i < nums2.length; i++) {
        // hm.put(nums2[i], i);
        // }

        // for (int i = 0; i < nums1.length; i++) {
        // int search = nums1[i];

        // for (int j = hm.get(search); j < nums2.length; j++) {

        // if (nums2[j] > search) {
        // arr[i] = nums2[j];
        // break;
        // }

        // if (j == nums2.length - 1) {
        // arr[i] = -1;
        // }
        // }

        // }

        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = nums2.length - 1; i >= 0; i--) {

           while(!stack.isEmpty() && stack.peek()<=nums2[i]){
            stack.pop();

           }
           hm.put(nums2[i],stack.isEmpty() ? -1:stack.peek());
           stack.push(nums2[i]);

        }
        for(int i=0;i<nums1.length;i++){
            arr[i]=hm.get(nums1[i]);
        }

        return arr;
    }
}
// @lc code=end
