/*
 * @lc app=leetcode id=143 lang=java
 *
 * [143] Reorder List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null)return ;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode fast=dummy;
        ListNode slow=dummy;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode head2=slow.next;
        slow.next=null;

        ListNode prev=null;
        ListNode curr=head2;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode newhead=prev;
        ListNode c1=head;
        ListNode c2=newhead;
        while( c2!=null){
            ListNode n1=c1.next;
            c1.next=c2;
            ListNode n2=c2.next;
            c2.next=n1;
            c1=n1;
            c2=n2;
        }

        
    }
}
// @lc code=end

