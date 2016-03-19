/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<Integer>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        int i = 0, j = list.size() - 1;
        while(i < j){
            if((int)list.get(i) != list.get(j)){
                return false;
            }
            ++i; --j;
        }
        return true;
    }
}