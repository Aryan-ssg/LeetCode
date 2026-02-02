/*
 * @lc app=leetcode id=342 lang=java
 *
 * [342] Power of Four
 */

// @lc code=start
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        if((n & 0b10101010101010101010101010101010)==0 && (n & (n-1))==0){
            return true;

        }else return false;


    }

    static boolean poweroffour(int n,int power){
        if(power>n){
            return false;
        }
        if(n==power){
            return true;
        }
        return poweroffour(n,power*4);
        }
}
// @lc code=end
