/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        boolean ans;
        if(head == null)
            return false;
        ListNode slow = head;
        ListNode fast = head;
        while(true){
            if(fast.next == null || fast.next.next == null){
                ans = false;
                break;
            }
            if(fast.next == slow || fast.next.next == slow){
                ans = true;
                break;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return ans;
    }
}