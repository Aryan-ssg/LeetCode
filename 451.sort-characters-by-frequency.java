/*
 * @lc app=leetcode id=451 lang=java
 *
 * [451] Sort Characters By Frequency
 */

// @lc code=start
import java.util.*;
class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> hm=new HashMap<>();
        
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1 );
        }

        Queue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>(
            (a,b) -> b.getValue()-a.getValue()
        );
        
        pq.addAll(hm.entrySet());

        StringBuilder sb=new StringBuilder();

        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> entry=pq.poll();
            int freq=entry.getValue();
            char key=entry.getKey();
            for(int i=0;i<freq;i++){
                sb.append(key);
            }
        }
        return sb.toString();

    }
}
// @lc code=end

