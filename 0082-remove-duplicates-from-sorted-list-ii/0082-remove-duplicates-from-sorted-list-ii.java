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
 import java.util.*;
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        LinkedHashMap<Integer, Boolean> tab = new LinkedHashMap<>();
            ListNode temp = head;
            while(temp!=null)
            {
                if(tab.get(temp.val)==null)
                tab.put(temp.val,true);
                else
                tab.put(temp.val,false);
                temp=temp.next;
            }
            ListNode newNode = new ListNode();
            temp = newNode;
            for(Integer key:tab.keySet())
            {
                if(tab.get(key))
                {
                    newNode.next=new ListNode(key,null);
                    newNode=newNode.next;
                }
            }
            return temp.next;
    }
}