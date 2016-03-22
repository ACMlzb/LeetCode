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
        if(head == null) return null;
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        int preVal = head.val;
        int cnt = 1;
        head = head.next;
        while(head != null){
            if(head.val == preVal){
                ++cnt;
            }
            else{
                if(cnt == 1){
                    pre.next = new ListNode(preVal);
                    pre = pre.next;
                }
                cnt = 1;
                preVal = head.val;
            }
            head = head.next;
        }
        if(cnt == 1)
            pre.next = new ListNode(preVal);
        return dummy.next;
    }
}