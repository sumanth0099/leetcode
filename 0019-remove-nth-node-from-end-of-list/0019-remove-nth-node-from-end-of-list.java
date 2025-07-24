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
        if(head.next==null)
        return null;
        int size = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        if((size-n)==0)
        head=head.next;
        else 
        {
            temp = head;
            int i=0;
            while(i<(size-n-1))
            {
                temp = temp.next;
                i++;
            }
            temp.next = temp.next.next;
        }
        return head;
    }
}