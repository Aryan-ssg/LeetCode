/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        // String s=Integer.toString(x);
        // for (int i=0;i<s.length()/2;i++){
        //     if(s.charAt(i)!=s.charAt(s.length()-i-1)){
        //         return false;
        //     }

        // }
        // return true;
        
        int a=x;
        int reverse=0;
        if(a<0){
            return false;
        }
        if (a==0){
            return true;
        }

        while(a>0){
            reverse=(reverse*10)+(a%10);
            a=a/10;
        }

        return reverse==x;



    }
}
// @lc code=end

