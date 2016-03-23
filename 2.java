/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head, cur, node1 = l1, node2 = l2;
        head = cur = new ListNode(0);
        int v1, v2, v;
        int more = 0;
        while(more != 0 || node1 != null || node2 != null){
            v1 = node1 == null ? 0 : node1.val;
            v2 = node2 == null ? 0 : node2.val;
            v = (v1 + v2 + more) % 10;
            more = v1 + v2 + more >= 10 ? 1 : 0;
               cur.next = new ListNode(v);
               cur = cur.next;
            node1 = node1 == null ? null : node1.next;
            node2 = node2 == null ? null : node2.next;
        }
        return head.next;
    }
}