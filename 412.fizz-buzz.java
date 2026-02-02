/*
 * @lc app=leetcode id=412 lang=java
 *
 * [412] Fizz Buzz
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                list.add("FizzBuzz");
                continue;
            }
            else if(i%3==0){
                list.add("Fizz");
                continue;
            }else if(i%5==0){
                list.add("Buzz");
                continue;
            }
            
            list.add(i+"");
        }
        return list;
        
        
    }
}
// @lc code=end

