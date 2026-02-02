/*
 * @lc app=leetcode id=171 lang=java
 *
 * [171] Excel Sheet Column Number
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int titleToNumber(String columnTitle) {
        // HashMap<Character,Integer> hm=new HashMap<>();
        // int count=1;
        // for(char c='A';c<='Z';c++){

        // hm.put(c,count);
        // count++;
        // }
        int num=0;
        for(int i=columnTitle.length();i>0;i--){
        num+=Math.pow(26,i-1)*(columnTitle.charAt(columnTitle.length()-i)-'A'+1);

        }
        return num;

        // int result = 0;
        // for (char c : columnTitle.toCharArray()) {
        //     result = result * 26 + (c - 'A' + 1);
        // }
        // return result;
    }
}
// @lc code=end
