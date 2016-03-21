/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m == n) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode p = head;
        ListNode left = null, right = null, a = null, b = null;
        int cnt = 1;
        while(p != null){
            if(cnt == m) {left = p; a = pre;}
            if(cnt == n) {right = p; b = p.next;}
            if(cnt > m && cnt <= n){
                ListNode tmp = pre;
                pre = p;
                p = p.next;
                pre.next = tmp;
            }
            else{
                p = p.next;
                pre = pre.next;
            }
            cnt++;
        }
        a.next = right;
        left.next = b;
        return dummy.next;
    }
}