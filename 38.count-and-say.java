/*
 * @lc app=leetcode id=38 lang=java
 *
 * [38] Count and Say
 */

// @lc code=start
class Solution {
    public String countAndSay(int n) {

        // if (n == 1) {

        // return "1";
        // }
        // String prev=countAndSay(n-1);
        // StringBuilder sb=new StringBuilder();

        // int count=1;
        // for(int i=0;i<prev.length()-1;i++){

        // if(prev.charAt(i)!=prev.charAt(i+1)){
        // sb.append(count).append(prev.charAt(i));
        // count=1;
        // }else{
        // count++;
        // }

        // }
        // sb.append(count).append(prev.charAt(prev.length()-1));
        // return sb.toString();
        String s = "1";

        for (int j = 2; j <= n; j++) {
            StringBuilder sb = new StringBuilder();

            int count = 1;
            for (int i = 0; i < s.length() - 1; i++) {

                if (s.charAt(i) != s.charAt(i + 1)) {
                    sb.append(count).append(s.charAt(i));
                    count = 1;
                } else {
                    count++;
                }
                

            }
            sb.append(count).append(s.charAt(s.length() - 1));
            s=sb.toString();
        }
        return s;

    }
}
// @lc code=end
