/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start

import java.util.ArrayList;
import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length()==0){
            return result;
        }
        Map<Integer, String> hm = new HashMap<>();
        hm.put(2, "abc");
        hm.put(3, "def");
        hm.put(4, "ghi");
        hm.put(5, "jkl");
        hm.put(6, "mno");
        hm.put(7, "pqrs");
        hm.put(8, "tuv");
        hm.put(9, "wxyz");
        combinations(0, digits, result, new StringBuilder(), hm);
        return result;

    }

    static void combinations(int index, String digits, List<String> result, StringBuilder s, Map<Integer, String> hm) {
        if (s.length() == digits.length()) {
            String str = s.toString();
            result.add(str);
            // result.add(new String(s));
            return;

        }

        String temp = hm.get(digits.charAt(index) - '0');
        for (int j = 0; j < temp.length(); j++) {
            s.append(temp.charAt(j));
            combinations(index + 1, digits, result, s, hm);
            s.deleteCharAt(s.length() - 1);

        }

    }
}
// @lc code=end
