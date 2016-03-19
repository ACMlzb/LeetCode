/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        Queue<Integer> pq = new PriorityQueue<Integer>();
        while(head != null){
            pq.add(head.val);
            head = head.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        while(!pq.isEmpty()){
            p.next = new ListNode(pq.poll());
            p = p.next;
        }
        return dummy.next;
    }
}