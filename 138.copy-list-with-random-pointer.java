/*
 * @lc app=leetcode id=138 lang=java
 *
 * [138] Copy List with Random Pointer
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return head;
        }
        HashMap<Node,Node> hm=new HashMap<>();

        Node curr=head;
        
        while(curr!=null){
            hm.put(curr,new Node(curr.val));
            curr=curr.next;
        }
        curr=head;

        while(curr!=null){
            hm.get(curr).next=hm.get(curr.next);
            hm.get(curr).random=hm.get(curr.random);
            curr=curr.next;
        }
        return hm.get(head);




    }
}
// @lc code=end

