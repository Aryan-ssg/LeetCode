/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // int len=0;
        // ListNode curr=head;
        // while(curr!=null){
        //     len++;
        //     curr=curr.next;
        // }
        
        // int node=len-n;
        // ListNode dummy=new ListNode(-1);
        // dummy.next=head;
        // curr=dummy;

        // while(node>0){
        //     curr=curr.next;
        //     node--;
        // }
        // curr.next=curr.next.next;
        // return dummy.next;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode fast=dummy;
        ListNode slow=dummy;

        for(int i=0;i<=n;i++){
            fast=fast.next;

        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return dummy.next;



        
    }
}
// @lc code=end

