/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    private List<Integer> list;
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null)
            return null;
        list = new ArrayList<Integer>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        Collections.sort(list);
        return rec(0, list.size() - 1);
    }
    private TreeNode rec(int start, int end){
        if(start > end)
            return null;
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(list.get(mid));
        node.left = rec(start, mid - 1);
        node.right = rec(mid + 1, end);
        return node;
    }
}