/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
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
    public boolean isPalindrome(ListNode head) {
        
        ListNode fast=head;
        ListNode slow=head;
       
        
       
        System.out.println();

        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;


        }
        ListNode secondhalf=slow;
        ListNode reversenode=reverse(secondhalf);
        


        while(reversenode!=null){
            if(head.val!=reversenode.val){
                return false;
            }
            head=head.next;
            reversenode=reversenode.next;
        }
        return true;





    }
    public static ListNode reverse(ListNode secondhalf){
        ListNode previous=null;
        
        while(secondhalf!=null){
            ListNode next=secondhalf.next;
            secondhalf.next=previous;
            previous=secondhalf;
            secondhalf=next;

        }
        return previous;



    }
}
// @lc code=end

