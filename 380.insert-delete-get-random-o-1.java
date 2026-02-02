/*
 * @lc app=leetcode id=380 lang=java
 *
 * [380] Insert Delete GetRandom O(1)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.*;

class RandomizedSet {
    Map<Integer,Integer> hm=new HashMap<>();
    List<Integer> lst=new ArrayList<>();
    
    Random rand=new Random();

    
    public RandomizedSet() {
        
    }
    
    public boolean insert(int val) {
        if(hm.containsKey(val)){
            return false;
        }
        lst.add(val);
        hm.put(val,lst.size()-1);
        
        return true;
    }
    
    public boolean remove(int val) {

        if(hm.containsKey(val)){

            // int in=lst.indexOf(val);
            int index=hm.get(val);
            int lastval=lst.get(lst.size()-1);

            lst.set(index,lastval);
            lst.remove(lst.size()-1);
            hm.put(lastval,index);
            hm.remove(val);
            

            // int temp=lst.get(lst.size()-1);
            // lst.add(lst.size()-1,val);
            // lst.add(in,temp);

            // lst.remove(lst.size()-1);
            // hm.remove(val);

            return true;
        }else{
            return false;
        }
        
    }
    
    public int getRandom() {
        int index=rand.nextInt(lst.size());
        return lst.get(index);
        
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
// @lc code=end

