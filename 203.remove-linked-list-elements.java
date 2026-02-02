/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
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
    public ListNode removeElements(ListNode head, int val) {
        
        
        ListNode first=new ListNode(100,head);
        ListNode prev=first;
        // while(first.val=val && first!=null ){
        //     if(first.val!=val){
        //         break;
        //     }
        //     first=first.next;
        // }
        ListNode curr=head;
        while(curr!=null){
            if(curr.val==val){
                prev.next=curr.next;
                curr=curr.next;
                
            }else{
                
                prev=curr;
                curr=curr.next;

            }
        }
        return first.next;
        
    }
}
// @lc code=end

