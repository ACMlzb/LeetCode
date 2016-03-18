/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        //at least two elements
        ListNode p = null;
        ListNode q = head;
        ListNode next;
        while(true){
            next = q.next;
            q.next = p;
            p = q;
            q = next;
            if(next == null) break;
        }
        return p;
    }
}