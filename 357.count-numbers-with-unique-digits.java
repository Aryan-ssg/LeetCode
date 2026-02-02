/*
 * @lc app=leetcode id=357 lang=java
 *
 * [357] Count Numbers with Unique Digits
 */

// @lc code=start
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int count=(int)Math.pow(10,n);
        int nonunique=0;
        if(n==0 || n==1){
            nonunique=0;
        }
        if(n>1){
            nonunique=(n-1)*9;
        }

        return count-nonunique;
        
    }
    
}
// @lc code=end

