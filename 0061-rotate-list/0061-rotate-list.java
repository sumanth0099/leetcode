class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        // Find length of the list
        int length = 1;
        ListNode t = head;
        while (t.next != null) {
            length++;
            t = t.next;
        }

        // Reduce k within bounds
        k = k % length;
        if (k == 0) return head;  // No rotation needed

        // Make it circular
        t.next = head;
        
        // Find new tail (length - k - 1) steps from head
        t = head;
        for (int i = 0; i < length - k - 1; i++) {
            t = t.next;
        }

        // Set new head and break the cycle
        ListNode newHead = t.next;
        t.next = null;
        
        return newHead;
    }
}
