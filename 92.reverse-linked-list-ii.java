/*
 * @lc app=leetcode id=92 lang=java
 *
 * [92] Reverse Linked List II
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null || right==left){return head;}
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode curr=dummy;
        ListNode beforel=dummy;
        for(int i=0;i<left;i++){
            beforel=curr;
            curr=curr.next;
        }
        ListNode l=curr;
        ListNode prev=null;
        for(int i=left;i<=right;i++){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        } 
        beforel.next=prev;
        l.next=curr;
        return dummy.next;


    }
}
// @lc code=end
