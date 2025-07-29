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
    public void reorderList(ListNode head) {
        List<Integer>li = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null)
        {
            li.add(temp.val);
            temp = temp.next;
        }
        temp = head;
        int start=0;
        int end = li.size()-1;
        int i=0;
        while(temp!=null)
        {
            if(i%2==0)
            {
                temp.val = li.get(start);
                start++;
            }
            else{
                temp.val=li.get(end);
                end--;
            }
            i++;
            temp=temp.next;
        }

    }
}