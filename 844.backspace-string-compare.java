/*
 * @lc app=leetcode id=844 lang=java
 *
 * [844] Backspace String Compare
 */

// @lc code=start
import java.util.*;
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(!stack1.isEmpty()){
                    stack1.pop();
                }
            }else{
                stack1.push(s.charAt(i));
            }
        }
        StringBuilder sb1=new StringBuilder();
        while(!stack1.isEmpty()){
            sb1.append(stack1.pop());
        }

        Stack<Character> stack2=new Stack<>();
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'){
                if(!stack2.isEmpty()){
                    stack2.pop();
                }
            }else{
                stack2.push(t.charAt(i));
            }
        }

        StringBuilder sb2=new StringBuilder();
        while(!stack2.isEmpty()){
            sb2.append(stack2.pop());
        }
        if(sb1.toString().equals(sb2.toString())){
            return true;
        }else{
            return false;
        }

        
        
    }
}
// @lc code=end

