/*
 * @lc app=leetcode id=374 lang=java
 *
 * [374] Guess Number Higher or Lower
 */

// @lc code=start
/**
 * Forward declaration of guess API.
 * 
 * @param num your guess
 * @return -1 if num is higher than the picked number
 *         1 if num is lower than the picked number
 *         otherwise return 0
 *         int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 1;
        int r = n;
        int check=0;
        while (l <= r) {
            check = l + (r - l) / 2;
            if (guess(check) == -1) {
                r = check - 1;
            }
            else if(guess(check)==1){
                l=check+1;
            }else{
                break;
            }

        }
        return check;


    }
}
// @lc code=end
