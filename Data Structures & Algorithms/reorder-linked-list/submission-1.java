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
    ListNode reverse(ListNode head){
        ListNode curr = head,prev = null;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    ListNode midOfLL(ListNode head){
        if(head == null)
        return head;
        ListNode slow = head, fast = head;
        while(fast!=null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public void reorderList(ListNode head) {
        ListNode p1 = head;
        ListNode mid = midOfLL(head);
        ListNode p2 = reverse(mid);

        while(p2.next!=null){
            ListNode p1_next = p1.next,p2_next = p2.next;
            p1.next = p2;
            p2.next = p1_next;

            p1 = p1_next;
            p2 = p2_next;
        }
        
    }
}
