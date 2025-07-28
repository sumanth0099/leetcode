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
        if(head==null || head.next==null)
        return head;
        ListNode c = head;
        ListNode b = null;
        ListNode a = null;
        while(c!=null)
        {
            b=c;
            c=c.next;
            b.next=a;
            a=b;
            if(c==null)
            head=b;
        }
        return head;
    }
}