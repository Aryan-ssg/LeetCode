/*
 * @lc app=leetcode id=725 lang=java
 *
 * [725] Split Linked List in Parts
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int length = 0;
        ListNode pointer = head;
        ListNode end = head;
        while (pointer != null) {
            if (pointer.next == null) {
                end = pointer;
            }
            length++;
            pointer = pointer.next;
        }
        int nodes = length / k;
        int leftover = length % k;

        // if (nodes < 1) {
        // int dummynodes = k - length;
        // for (int i = 0; i < dummynodes; i++) {
        // ListNode dummy = new ListNode();
        // end.next = dummy;
        // end = end.next;
        // }

        // }

        pointer = head;
        ListNode next = head;

        ListNode[] list = new ListNode[k];
        for (int j = 0; j < k; j++) {

            list[j] = pointer;
            // ListNode previous = new ListNode(-1);
            // previous.next = pointer;

            int totalnodes = nodes;
            if (leftover > 0) {
                totalnodes++;
                leftover--;
            }
            for (int i = 0; i < totalnodes - 1; i++) {
                // previous = previous.next;

                pointer = pointer.next;

            }
            if (pointer != null) {
                if (pointer.next != null) {
                    next = pointer.next;
                    pointer.next = null;
                    pointer = next;
                } else {
                    pointer = null;
                }
            }

            // previous.next = null;

        }
        return list;

    }
}
// @lc code=end
