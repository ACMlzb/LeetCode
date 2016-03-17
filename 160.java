/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        int cnt1 = 0;
        int cnt2 = 0;
        ListNode p = headA;
        while(p.next != null){
            p = p.next;
            cnt1++;
        }
        ListNode q = headB;
        while(q.next != null){
            q = q.next;
            cnt2++;
        }
        if(p != q) return null;
        p = headA;
        q = headB;
        if(cnt1 > cnt2)
            for(int i = 0; i < cnt1 - cnt2; ++i) p = p.next;
        else
            for(int i = 0; i < cnt2 - cnt1; ++i) q = q.next;
        while( p!= q){
            p = p.next;
            q = q.next;
        }
        return p;
    }
}