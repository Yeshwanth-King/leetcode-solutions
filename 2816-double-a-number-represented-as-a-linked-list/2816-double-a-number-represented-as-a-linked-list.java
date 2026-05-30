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
    public ListNode doubleIt(ListNode head) {
        ListNode curr = head;
        if(curr.next == null && curr.val < 5)
		{
			curr.val *= 2;
			return curr;
		}

        int carry = 0;
		carry = doubler_helper(curr);
		if(carry == 1)
		{
			ListNode nn = new ListNode(1);
			nn.next = head;
			head = nn;
		}
        return head;
    }

    int doubler_helper(ListNode curr)
	{
		
		if(curr.next == null)
		{
			if(curr.val < 5)
			{
				curr.val *= 2;
				return 0;
			}
			else
			{
				curr.val *= 2;
				curr.val %= 10;
				return 1;				
			}
		}
		int carry = 0;
		carry = doubler_helper(curr.next); 
		curr.val *= 2;
		curr.val += carry;
		if(curr.val < 10)
		{
			return 0;
		}
		else
		{
			curr.val %= 10;
			return 1;
		}
	}
}