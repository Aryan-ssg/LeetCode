/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

// @lc code=start

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        List<Integer> prev = new ArrayList<>();

        List<Integer> first = new ArrayList<>();
        first.add(1);
        triangle.add(first);

        for (int i = 1; i < numRows; i++) {
            List<Integer> lst = new ArrayList<>();
            lst.add(1);

            
            for (int j = 1; j < i; j++) {
                int num = prev.get(j - 1) + prev.get(j);
                lst.add(num);
            }
            lst.add(1);
            prev = lst;
            triangle.add(lst);
        }
        return triangle;

    }
}
// @lc code=end
