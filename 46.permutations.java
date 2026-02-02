/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        combinations1(0,nums,result);
        return result;

        // boolean[] arr=new boolean[nums.length];


        
        
    }
    static void combinations(int index,int[] nums,List<List<Integer>> perm){
        if(index==nums.length){
            List<Integer> arr=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                arr.add(nums[i]);
            }
            perm.add(arr);
            return;
        }
        for(int i=index;i<nums.length;i++){

            int temp=nums[index];
            nums[index]=nums[i];
            nums[i]=temp;

            combinations(index+1,nums,perm);
          
            temp=nums[index];
            nums[index]=nums[i];
            nums[i]=temp;


        }
    }
    static void combinations1(int index,int[] nums,List<List<Integer>> result){
        if(index==nums.length-1){
            ArrayList<Integer> arr=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                arr.add(nums[i]);
            }
            result.add(arr);
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(nums,i,index);
            combinations1(index+1, nums,result);
            swap(nums,i,index);
            
        }
    }
    static void swap(int[] nums,int i,int index){
        int temp=nums[i];
        nums[i]=nums[index];
        nums[index]=temp;
    }

}
// @lc code=end

