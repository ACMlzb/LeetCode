/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null)
            return;
        int cnt = 1;
        ListNode p = head;
        while(p.next != null){
            p = p.next;
            cnt++;
        }
        int m = (cnt + 3) / 2; //start of reverse
        int n = cnt; //end of reverse
        ListNode pre = head;
        p = pre.next;
        ListNode mid1 = null, mid2 = null;
        cnt = 2;
        while(p != null){
            if(cnt == m) {mid1 = pre; mid2 = p;}
            if(cnt > m && cnt <= n){
                ListNode tmp = pre;
                pre = p;
                p = p.next;
                pre.next = tmp;
                cnt++;
            }else{
                p = p.next;
                pre = pre.next;
                cnt++;
            }
        }
        ListNode q = head;
        p = pre;
        mid1.next = null;
        mid2.next = null;
        for(int i = 1; i <= n/2; ++i){
            ListNode nextq = q.next;
            ListNode nextp = p.next;
            q.next = p;
            p.next = nextq;
            p = nextp;
            q = nextq;
        }
    }
}