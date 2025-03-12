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
    public ListNode reverseList(ListNode head) {
        ListNode p = null;  
        ListNode n = head;
        while(n != null) { 
            ListNode next = n.next; 
            n.next = p;
            p = n;
            n = next;
        }
       return p; 
    }
}