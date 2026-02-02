/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for (String s : strs) {
            int[] arr = new int[26];
            for (char c : s.toCharArray()) {
                arr[c - 'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<arr.length;i++){
                sb.append(arr[i]).append("#");
            }
            String key=sb.toString();

            List<String> lst = hm.getOrDefault(key, new ArrayList<>());

            lst.add(s);
            hm.put(key, lst);

        }

        return new ArrayList<>(hm.values());

    }
}
// @lc code=end
