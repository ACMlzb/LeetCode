/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode p, q, qHead;
        p = head;
        q = p.next;
        qHead = q;
        while(true){
            if(q.next == null)break;
            p.next = q.next;
            p = q.next;
            if(p.next == null)break;
            q.next = p.next;
            q = p.next;
        }
        p.next = qHead;
        q.next = null;
        return head;
    }
}
