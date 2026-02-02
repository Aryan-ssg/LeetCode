/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start

import java.util.ArrayList;

class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> arr=new ArrayList<>();
        String s1=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s1.charAt(i))){
                arr.add(s1.charAt(i));
            }


        }
        for(int i=0;i<arr.size()/2;i++){
            if(arr.get(i)!=arr.get(arr.size()-i-1)){
                return false;
            }
        }
        return true;
         
        
    }
}
// @lc code=end

