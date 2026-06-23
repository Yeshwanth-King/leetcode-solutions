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
        if(head == null || head.next == null) return null;
        ListNode temp = head;
        ListNode prev = null;
        if(n == 1)
        {
            while(temp.next != null)
            {
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
            return head;
        }
        // int L = 0;
        // while(temp != null)
        // {
        //     L++;
        //     temp = temp.next;
        // }
        // if(n == L)
        // {
        //     head = head.next;
        // }
        // temp = head;
        // int res = L-n-1;
        // while(res != 0)
        // {
        //     res--;
        //     temp = temp.next;
        // }
        // temp.next = temp.next.next;

        ListNode slow;
        ListNode fast;
        slow = head;
        fast = head;
        while(n > 0)
        {
            fast = fast.next;
            n--;
        }
        if(fast == null)
        {
            head = head.next;
            return head;
        }
        while(fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return head;
    }
}