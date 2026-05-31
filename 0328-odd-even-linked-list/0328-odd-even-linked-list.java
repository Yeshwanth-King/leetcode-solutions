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
    public ListNode oddEvenList(ListNode start) {
        if(start == null || start.next == null || start.next.next == null)
		{
			return start;
		}
		ListNode c, n, nn, evenhead;
		c = start;
		n = start.next;
		nn = n.next;
		evenhead = start.next;
		
		while(n != null && nn != null)
		{
			c.next = nn;
			n.next = nn.next;
			nn.next = evenhead;
			
			c = c.next;
			n = n.next;
			if(n == null) break;
			nn = n.next;
		}
		
		return start;
    }
}