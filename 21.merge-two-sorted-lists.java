/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if (list1 == null ) {
            return list2;
        }
        if(list2==null){
            return list1;
        }
        if (list1.val > list2.val) {
            return mergeTwoLists(list2, list1);

        }
        ListNode first=list1;
        ListNode second=list2;
        while (first.next != null) {

            if (first.next.val >= second.val) {
                ListNode newnode = first.next;
                first.next = second;
                first = second;
                second = newnode;

            } else if (first.next.val < second.val) {
                first = first.next;
            }

        }
        if(first.next==null){
            first.next=second;
        }
        return list1;

    }
}
// @lc code=end
