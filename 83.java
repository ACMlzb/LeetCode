/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        //at least 2 nodes
        int preVal = head.val;
        ListNode p = head;
        while(p.next != null){
            if(p.next.val == preVal){
                p.next = p.next.next;
            }
            else{
                preVal = p.next.val;
                p = p.next;
            }
        }
        return head;
    }
}