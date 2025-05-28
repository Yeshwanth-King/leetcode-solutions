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
        if (head == null)
            return head;
        if (head.next == null && n == 1) {
            return null;
        }
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        if (count == n) {
            head = head.next;
            return head;
        }
        int idxFromFront = count - n + 1;
        ListNode prev = null;
        temp = head;
        while (idxFromFront > 1 && temp != null) {
            idxFromFront--;
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        temp.next = null;
        return head;
    }
}