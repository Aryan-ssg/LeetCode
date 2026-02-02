/*
 * @lc app=leetcode id=2259 lang=java
 *
 * [2259] Remove Digit From Number to Maximize Result
 */

// @lc code=start
class Solution {
    public String removeDigit(String number, char digit) {
        
        int ind=0;
        int digind=-1;
        while(ind<number.length()){
            if(number.charAt(ind)==digit){
                digind=ind;
            }
            if(ind==number.length()-1){
                break;
            }
            if(number.charAt(ind)==digit  && number.charAt(ind)<number.charAt(ind+1)){
                
                return number.substring(0, ind)+number.substring(ind+1,number.length());
                
            }
            // sb.append(number.charAt(ind));
            ind++;
        }
        // sb.append(number.toCharArray(),0,digind).append(number.toCharArray(),digind+1,number.length());
        return number.substring(0,digind)+number.substring(digind+1,number.length());


    }
}
// @lc code=end

