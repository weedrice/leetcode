import base.ListNode;

public class AddTwoNumbers {
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode mainNode = new ListNode(0);
        ListNode returnNode = mainNode;

        while(l1 != null || l2 != null || carry != 0) {
            if(l1 != null) {
                carry = carry + l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                carry = carry + l2.val;
                l2 = l2.next;
            }
            returnNode.next = new ListNode(carry % 10);
            carry /= 10;
            returnNode = returnNode.next;
        }

        return mainNode.next;
    }
}
