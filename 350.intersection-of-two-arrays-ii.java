/*
 * @lc app=leetcode id=350 lang=java
 *
 * [350] Intersection of Two Arrays II
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return intersect(nums2,nums1);
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        ArrayList<Integer> arr=new ArrayList<>(); 
        for(int i=0;i<nums1.length;i++){
            if(hm.containsKey(nums1[i])){
                hm.put(nums1[i],hm.get(nums1[i])+1);

            }else{
                hm.put(nums1[i],1);
            }

        }
        for(int num:nums2){
            if(hm.containsKey(num) && hm.get(num)>0){
                arr.add(num);
                hm.put(num,hm.get(num)-1);
            }
        }

        
        
        int[] a=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            a[i]=arr.get(i);
        }
        return a;
        

        
    
     
    }
}
// @lc code=end
