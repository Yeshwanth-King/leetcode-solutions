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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null)
            return head;
        ListNode temp = head;
        int i = k;
        while (temp != null && i > 0) {
            temp = temp.next;
            i--;
        }
        if (i != 0)
            return head;
        ListNode rest = reverseKGroup(temp, k);

        ListNode curr = head;
        ListNode prev = rest, next = head.next;
        while (next != null && next != rest && next != temp) {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }

        curr.next = prev;
        head = curr;
        return head;
    }
}