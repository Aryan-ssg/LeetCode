/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
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
    public ListNode reverseList(ListNode head) {
        // ListNode prev = null;
        // ListNode curr = head;

        // while (curr != null) {

        //     ListNode nextnode=curr.next;
        //     curr.next=prev;
        //     prev=curr;
        //     curr=nextnode;
        // }
        // return prev;
        return reverse(null,head);
    }
    static ListNode reverse(ListNode prev,ListNode curr){
        if(curr==null){
            return prev;
        }
        ListNode nextNode=curr.next;
        curr.next=prev;
        
        return reverse(curr,nextNode);

    }
}
// @lc code=end
