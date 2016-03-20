/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && ((fast = fast.next) != null) && ((fast = fast.next) != null)){
            slow = slow.next;
        }
        ListNode tmp = slow;
        slow = slow.next;
        tmp.next = null;
        head = sortList(head);
        slow = sortList(slow);
        return merge(head, slow);
    }
    private ListNode merge(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val < l2.val){//l1 is the head
            l1.next = merge(l1.next, l2);
            return l1;
        }else{
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }
}