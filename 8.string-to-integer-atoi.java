/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start

import java.math.BigInteger;

class Solution {
    public int myAtoi(String s) {
        String num = "";
        boolean trig = true;
        long ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && trig) {
                continue;
            } else if (s.charAt(i) == '+' && trig) {
                num += s.charAt(i);
                trig = false;
                continue;
            } else if (s.charAt(i) == '-' && trig) {
                num += s.charAt(i);
                trig = false;
                continue;
            }
            if (Character.isDigit(s.charAt(i))) {
                num += s.charAt(i);
                trig = false;
                continue;
            } else {
                break;

            }

        }
        if (num.length() == 0) {
            return 0;
        }
        if (num.length() == 1) {
            if (num.charAt(0) == '+' || num.charAt(0) == '-') {
                return 0;
            }
        }
        if (num.length() >= 12) {
            if (num.charAt(0) == '+') {
                num = "+2147483647";
            }else if (num.charAt(0) == '-'){
                num="-2147483648";
            }else{
                num="2147483647";
            }

        }

        ans = Long.parseLong(num);
        if (ans > Integer.MAX_VALUE) {
            ans = Integer.MAX_VALUE;
        } else if (ans < Integer.MIN_VALUE) {
            ans = Integer.MIN_VALUE;
        }
        int ans1 = (int) ans;
        return ans1;

    }
}
// @lc code=end
