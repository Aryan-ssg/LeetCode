/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
            
            
            
            
        }
        ArrayList[] arr = new ArrayList[nums.length + 1];

        for (int i : hm.keySet()) {

            int value = hm.get(i);
            if (arr[value] == null) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(i);
                arr[value] = temp;
            } else {
                ArrayList<Integer> temp = arr[value];
                temp.add(i);
                arr[value] = temp;
            }

        }
        int[] ans = new int[k];
        int ind = 0;
        int count = k;
        for (int i = nums.length; i > 0; i--) {
            if (arr[i] != null) {
                ArrayList<Integer> temp = arr[i];
                // while (count != 0 && temp.size() != 0) {
                //     ans[ind] = temp.removeFirst();
                //     count--;
                //     ind++;

                // }
                for(int c:temp){
                    ans[ind] = c;
                    count--;
                    ind++;
                    if(count==0){
                        return ans;
                    }

                }

            }
        }
        return ans;

    }
}
// @lc code=end







































































































































































































































































































































































