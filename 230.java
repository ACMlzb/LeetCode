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
    HashMap<TreeNode, Integer> nodeNum = new HashMap<TreeNode, Integer>();
    public int kthSmallest(TreeNode root, int k) {
        getNodeNum(root);
        nodeNum.put(null, 0);
        return find(root, k);
    }
    private int getNodeNum(TreeNode node){
        if(node == null)
            return 0;
        int ans = getNodeNum(node.left) + getNodeNum(node.right) + 1;
        nodeNum.put(node, ans);
        return ans;
    }
    private int find(TreeNode node, int k){
        int n1 = nodeNum.get(node.left);
        int n2 = nodeNum.get(node.right);
        if(k == n1 + 1)
            return node.val;
        if(k < n1 + 1) // that is: k <= n1
            return find(node.left, k);
        // k > n1 + 1;
        return find(node.right, k - n1 - 1);
    }
}