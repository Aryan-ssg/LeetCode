/*
 * @lc app=leetcode id=24 lang=java
 *
 * [24] Swap Nodes in Pairs
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
    public ListNode swapPairs(ListNode head) {

        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode curr=dummy;
        while(curr.next!=null && curr.next.next!=null){
            // ListNode temp=curr.next;
            // curr.next=curr.next.next;
            // temp.next=temp.next.next;
            // curr.next.next=temp;
            // curr=curr.next.next;
            ListNode first=curr.next;
            ListNode second=curr.next.next;

            first.next=second.next;
            second.next=first;
            curr.next=second;

            curr=first;


        }
        return dummy.next;
        
    }
}
// @lc code=end

