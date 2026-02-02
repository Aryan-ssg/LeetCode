/*
 * @lc app=leetcode id=172 lang=java
 *
 * [172] Factorial Trailing Zeroes
 */

// @lc code=start
class Solution {
    public int trailingZeroes(int n) {
        return zeroes(n,0,5);
        
    }
    static int zeroes(int n,int zero,int pow){
        
        if(n/pow==0){
            return zero;
        }
        zero+=n/pow;
        return zeroes(n,zero,pow*5);
    }
}
// @lc code=end

