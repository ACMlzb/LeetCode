/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode p, q;
        while((p = pre.next) != null && (q = p.next) != null){
            pre.next = q;
            p.next = q.next;
            q.next = p;
            pre = p;
        }
        return dummy.next;
    }
}