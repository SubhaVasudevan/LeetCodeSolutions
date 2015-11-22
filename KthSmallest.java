/* Given a binary search tree, write a function kthSmallest to find the kth smallest element in it. 8*/


import java.util.*;
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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> inorder = new ArrayList<Integer>();
        InorderTraversal(root, inorder); //get the inorder traversal
        
        return(inorder.get(k-1)); //find the kth item
        
    }
    
    public void InorderTraversal(TreeNode root, ArrayList<Integer>inorder) {
        if(root.left!= null) {
            InorderTraversal(root.left, inorder);
        }
        inorder.add(root.val);
        if(root.right != null) {
            InorderTraversal(root.right, inorder);
        }
    }
}