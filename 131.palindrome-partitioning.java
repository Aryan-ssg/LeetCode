/*
 * @lc app=leetcode id=131 lang=java
 *
 * [131] Palindrome Partitioning
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        backtrack(0,new ArrayList<String>(),result,s);
        return result;

        
        
    }
    static void backtrack(int start,List<String> part,List<List<String>> result,String s){
        if(start>=s.length()){
            result.add(new ArrayList<>(part));
            return;
        }
        for(int i=start;i<s.length();i++){
            if(palindrome(s.substring(start, i+1))){
                part.add(s.substring(start, i+1));
                backtrack(i+1,part,result,s);
                part.remove(part.size()-1);

            }
        }
        
    }
    static boolean palindrome(String s){
        for(int j=0;j<s.length()/2;j++){
            if(s.charAt(j)!=s.charAt(s.length()-j-1)){
                return false;
            }

        }
        return true;
    }
}
// @lc code=end

