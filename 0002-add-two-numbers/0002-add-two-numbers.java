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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode l4 = l3;
            int carry=0;
        while(l1!=null && l2!=null)
        {
                ListNode newNode = new ListNode();
                newNode.val=l1.val+l2.val+carry;
                carry=0;
                if(newNode.val>9)
                {
                    newNode.val=newNode.val%10;
                    carry=1;
                }
                l3.next=newNode;
                l3=l3.next;
                l1=l1.next;
                l2=l2.next;   
        }
        while(l1!=null)
        {
             ListNode newNode = new ListNode();
                newNode.val=l1.val+carry;
                carry=0;
                if(newNode.val>9)
                {
                    newNode.val=newNode.val%10;
                    carry=1;
                }
                l3.next=newNode;
                l3=l3.next;
                l1=l1.next;
        }
        while(l2!=null)
        {
             ListNode newNode = new ListNode();
                newNode.val=l2.val+carry;
                carry=0;
                if(newNode.val>9)
                {
                    newNode.val=newNode.val%10;
                    carry=1;
                }
                l3.next=newNode;
                l3=l3.next;
                l2=l2.next;
        }
         ListNode newNode = new ListNode();
         newNode.val=carry;
        if(carry!=0)
        l3.next=newNode;
        return l4.next;
    }
}