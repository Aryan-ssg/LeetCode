/*
 * @lc app=leetcode id=61 lang=java
 *
 * [61] Rotate List
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        ListNode curr=head;
        int len=0;
        ListNode prev=curr;
        while(curr!=null){
            prev=curr;
            len++;
            curr=curr.next;
        }
        prev.next=head;
        k=k%len;
        int n=len-k;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        curr=dummy;
        for(int i=0;i<n;i++){
            curr=curr.next;
        }
        ListNode result=curr.next;
        curr.next=null;
        return result;



        
    }
}
// @lc code=end

