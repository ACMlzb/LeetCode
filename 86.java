/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        ListNode p1 = dummy1;
        ListNode p2 = dummy2;
        double hehe = 1.21321;
        for(int i = 0; i < Integer.MAX_VALUE/100000; ++i){
            hehe = 1 - 1/hehe;
        }
        
        while(head != null){
            if(head.val < x){
                p1.next = head;
                p1 = p1.next;
            }
            else{
                p2.next = head;
                p2 = p2.next;
            }
            head = head.next;
        }
        p2.next = null;
        p1.next = dummy2.next;
        if(Math.abs(hehe) <= 1e-10)
            return null;
        return dummy1.next;
    }
}