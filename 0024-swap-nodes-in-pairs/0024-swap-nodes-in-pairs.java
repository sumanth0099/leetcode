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
    public static void swapNodes(ListNode n1,ListNode n2)
    {
        if(n1==null || n2==null)
        return;
        int data = n1.val;
        n1.val=n2.val;
        n2.val=data;
    }
    public ListNode swapPairs(ListNode head) {
        ListNode flag = head;
        int i=1;
        while(head!=null)
        {
            ListNode temp = head;
            head=head.next;
            if(i%2!=0)
            Solution.swapNodes(temp,head);
              i++;
        }
        return flag;
    }
}