/*
 * @lc app=leetcode id=1396 lang=java
 *
 * [1396] Design Underground System
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class UndergroundSystem {
    Map<Integer, Map<String, Integer>> hm = new HashMap<>();
    Map<String, int[]> traveltime = new HashMap<>();

    public UndergroundSystem() {

    }

    public void checkIn(int id, String stationName, int t) {
        Map<String, Integer> inner = new HashMap<>();
        inner.put(stationName, t);

        hm.put(id, inner);
    }

    public void checkOut(int id, String stationName, int t) {
        String in = "";
        Map<String, Integer> inner = hm.get(id);
        for (String s : inner.keySet()) {
            in = s;
        }
        int t1 = hm.get(id).get(in);
        int t2 = t;

        int[] lst = traveltime.getOrDefault(in + "->" + stationName, new int[2]);
        lst[0]+=t2 - t1;
        lst[1]++;
        traveltime.put(in + "->" + stationName, lst);

    }

    public double getAverageTime(String startStation, String endStation) {
        int[] lst = traveltime.get(startStation + "->" + endStation);
        double sum = lst[0];
        
        double avg = sum / lst[1];
        return avg;

    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
// @lc code=end
