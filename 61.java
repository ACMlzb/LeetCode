/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        int n = 1;//the number of nodes
        ListNode p = head;
        while(p.next != null){
            p = p.next;
            ++n;
        }
        System.out.println(n);
        ListNode end = p;
        k %= n;
        if(k == 0) return head;
        k = n - k;
        p = head;
        while( (--k) > 0)
            p = p.next;
        ListNode q = p.next;
        end.next = head;
        p.next = null;
        return q;
    }
}
