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
    //(log(n))^2 time complexity
    // change something
    int h = 0;
    TreeNode root;
    public int countNodes(TreeNode _root) {
        root = _root;
        if(root == null)
            return 0;
        TreeNode p = root;
        while(p.left != null){
            ++h;
            p = p.left;
        }
        int start = 0;
        int end = (1 << h) - 1;
        int mid, res;
        while(true){
            if(start == end){
                res = start; break;
            }else if(end - start == 1){
                res = has(end) ? end : start; break;
            }else{
            mid = start + (end - start) / 2;
            if(has(mid))
                start = mid;
            else
                end = mid - 1;
            }
        }
        return (1 << h) + res;
    }
    private boolean has(int index){
        TreeNode p = root;
        for(int i = h - 1; i >= 0; --i){
            if(((index >> i) & 1) == 0)
                p = p.left;
            else
                p = p.right;
        }
        return p != null;
    }
}