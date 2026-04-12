/*
 * @lc app=leetcode id=229 lang=java
 *
 * [229] Majority Element II
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Map<Integer,Integer> mapping=new HashMap<>();
        List<Integer> lst = new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        // if(mapping.containsKey(nums[i])){
        // mapping.put(nums[i], mapping.get(nums[i])+1);

        // }else{
        // mapping.put(nums[i],1);
        // }
        // }
        // // for(int i=0;i<nums.length;i++){
        // // if(mapping.get(nums[i])>nums.length/3){
        // // lst.add(nums[i]);
        // // }
        // // }
        // for(int i:mapping.keySet()){
        // if(mapping.get(i)>nums.length/3){
        // lst.add(i);
        // }

        // }
        // int cand1 = -1;
        // int cand2 = -1;
        // int count1 = 0;
        // int count2 = 0;
        // for (int i = 0; i < nums.length; i++) {
        // if (nums[i] == cand1) {
        // count1++;
        // } else if (nums[i] == cand2) {
        // count2++;
        // } else if (count1 == 0) {
        // cand1 = nums[i];
        // count1++;
        // } else if (count2 == 0) {
        // cand2 = nums[i];
        // count2++;
        // } else {
        // count1--;
        // count2--;
        // }

        // }
        // count1 = 0;
        // count2 = 0;
        // for (int i = 0; i < nums.length; i++) {
        // if (nums[i] == cand1) {
        // count1++;
        // } else if (nums[i] == cand2) {
        // count2++;
        // }
        // }
        // if (count1 > nums.length / 3) {
        // lst.add(cand1);
        // }
        // if (count2 > nums.length / 3) {
        // lst.add(cand2);
        // }
        // return lst;

        int n = nums.length;
        int num1 = 0;
        int num2 = 0;
        int c1 = 0;
        int c2 = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == num1) {
                c1++;
            } else if (nums[i] == num2) {
                c2++;
            } else if (c1 == 0) {
                num1 = nums[i];
                c1++;
            } else if (c2 == 0) {
                num2 = nums[i];
                c2++;
            } else {
                c1--;
                c2--;
            }  

        }

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == num1) {
                count1++;
            } else if (nums[i] == num2) {
                count2++;
            }
        }
        if (count1 > n / 3) {
            lst.add(num1);
        }
        if (count2 > n / 3) {
            lst.add(num2);
        }

        return lst;

    }
}
// @lc code=end
