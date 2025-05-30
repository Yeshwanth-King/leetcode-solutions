/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode hare = head, tot = head;
        while(hare != null && hare.next != null ){
            tot = tot.next;
            hare = hare.next.next;
        if(hare == tot) return true;
        }
        return false;
    }
}