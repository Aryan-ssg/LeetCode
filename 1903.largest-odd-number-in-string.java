/*
 * @lc app=leetcode id=1903 lang=java
 *
 * [1903] Largest Odd Number in String
 */

// @lc code=start
class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        String max="";
        for(int i=n-1;i>=0;i--){
            int digit=num.charAt(i)-'0';
            if((digit%2) !=0){
               
                max=num.substring(0, i+1);
                break;

            }


        }
       return max;
        
    }
}
// @lc code=end































































































































