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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<lists.length;i++)
        {
            ListNode temp = lists[i];
            while(temp!=null)
            {
                l.add(temp.val);
                temp=temp.next;
            }
        }
        ListNode head = new ListNode();
        ListNode temp = head;
        Collections.sort(l);
        for(int i=0;i<l.size();i++)
        {
            head.next=new ListNode(l.get(i),null);
            head=head.next;
        }
        return temp=temp.next;
    }
}