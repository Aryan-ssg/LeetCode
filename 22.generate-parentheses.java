/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 */

// @lc code=start
import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        backtrack(n, result, new StringBuilder(), 0, 0);
        return result;

    }

    static void backtrack(int n, List<String> result, StringBuilder s, int open, int close) {
        if (s.length() == 2 * n) {

            result.add(new String(s));
            return;
        }
        // else if (open > n || close > n || close > open) {
        // return;

        // }

        if (open < n) {

            s.append("(");
            backtrack(n, result, s, open + 1, close);
            s.deleteCharAt(s.length() - 1);
        }
        
        if (close < open) {
            s.append(")");
            backtrack(n, result, s, open, close + 1);

            s.deleteCharAt(s.length() - 1);

        }

    }

    static boolean isValid(String s) {

        int balance = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(') {
                balance++;
            } else if (c == ')') {

                if (balance == 0)
                    return false;
                balance--;
            }
        }
        return balance == 0;
    }
}
// @lc code=end
