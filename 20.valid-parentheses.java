/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start

import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> map=new HashMap<>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');
        
        Stack<Character> stack=new Stack<Character>();
        for(char c:s.toCharArray()){
            if(map.containsValue(c)){
                stack.push(c);
            }
            else if(map.containsKey(c)){
                if(stack.isEmpty() || stack.pop()!=map.get(c)){
                    return false;
                }
            }
        }
        return stack.empty();

        
        
    }
}
// @lc code=end

