/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * Make c charge
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> list = new ArrayList<ListNode>();
        ListNode p = head;
        int cnt = 0;
        while(p != null){
            list.add(p);
            p = p.next;
            cnt++;
        }
        int index = cnt - n;
        if(index == 0)
            return head.next;
        list.get(index - 1).next = list.get(index).next;
        return head;
    }
}