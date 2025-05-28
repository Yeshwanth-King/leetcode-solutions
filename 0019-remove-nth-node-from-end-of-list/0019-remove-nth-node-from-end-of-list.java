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
        if(head == null) return head;
        if(head.next == null && n == 1) return null; 
        ListNode fast = head, prev = null, curr = head;
        while (n > 1 & fast != null) {
            fast = fast.next;
            n--;
        }
        while (fast.next != null) {
            prev = curr;
            curr = curr.next;
            fast = fast.next;
        }
        if(prev == null){
            head = head.next;
            return head;
        }
        prev.next = curr.next;
        curr.next = null;
        return head;
    }
}