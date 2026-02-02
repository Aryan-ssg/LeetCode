/*
 * @lc app=leetcode id=1047 lang=java
 *
 * [1047] Remove All Adjacent Duplicates In String
 */

// @lc code=start
import java.util.*;
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();

        for(int i=s.length()-1;i>=0;i--){
            if(!stack.isEmpty() && stack.peek()==s.charAt(i)){
                stack.pop();

            }else{
                stack.push(s.charAt(i));
            }

        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());

        }
        return sb.toString();
        
    }
}
// @lc code=end

