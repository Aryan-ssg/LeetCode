/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        
        int smallest = 250;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < smallest) {
                smallest = strs[i].length();
            }
        }
        if(strs.length==1){
            sb.append(strs[0]);
            return sb.toString();
        }
        
        
            for (int i = 0; i < smallest; i++) {
                char current=strs[0].charAt(i);
                
                for(int j=0;j<strs.length;j++){

                    if(strs[j].charAt(i)!=current){
                        return sb.toString();
                    }
                }
                sb.append(current);
                
            }
            
        
        return sb.toString();

    }
}
// @lc code=end
