class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        int length = 1;
        ListNode t = head;
        while (t.next != null) {
            length++;
            t = t.next;
        }
        k = k % length;
        if (k == 0) return head;  

        t.next = head;
        
        t = head;
        for (int i = 0; i < length - k - 1; i++) {
            t = t.next;
        }
        ListNode newHead = t.next;
        t.next = null;
        
        return newHead;
    }
}
