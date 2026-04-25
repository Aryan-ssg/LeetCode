/*
 * @lc app=leetcode id=151 lang=java
 *
 * [151] Reverse Words in a String
 */

// @lc code=start
import java.util.*;

class Solution {
    public String reverseWords(String s) {
        List<String> list = new ArrayList<>();

        int i = 0;
        while (i < s.length()) {
            while (i < s.length() && s.charAt(i) == ' ') {
                i++;
            }
            StringBuilder sb = new StringBuilder();
            while (i < s.length() && s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
                i++;
            }
            if (!sb.isEmpty()) {
                list.add(sb.toString());

            }

        }
        StringBuilder sb = new StringBuilder();
        for (int j = list.size() - 1; j >= 0; j--) {
            if (j != 0) {
                sb.append(list.get(j)).append(" ");
            } else {
                sb.append(list.get(j));
            }

        }
        return sb.toString();

    }
}
// @lc code=end
