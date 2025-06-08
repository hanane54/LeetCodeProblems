// using recursive call to check if two trees are the same 
// can be found on https://leetcode.com/problems/same-tree/
// 

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ( p == null && q == null ){
            return true; 
        }
        if ( p != null && q != null && p.left == null && q.left == null && p.right ==null && q.right ==null  ){
            return p.val == q.val ; 
        }
        if ( p == null || q == null ){
            return false; 
        }
        if ( p.left == null && q.left ==null && p.right !=null && q.right !=null ){
            return  isSameTree(p.right, q.right) ; 
        }
        if ( p.left != null && q.left !=null && p.right ==null && q.right ==null ){
            return isSameTree(p.left, q.left)  ; 
        }

        if ( p.left != null && q.left !=null && p.right !=null && q.right !=null ){
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right) ; 
        }
        return false; 
    }
}