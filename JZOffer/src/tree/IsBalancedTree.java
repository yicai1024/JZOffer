package tree;

import tree.TreeDepth.TreeNode;

public class IsBalancedTree {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val; //记录tree的深度

	    }
	}

	
public boolean IsBalanced_Solution(TreeNode root) {
       if(root == null){//如果是一棵空树，那么它是一棵平衡二叉树
    	   return true;
       }else{
    	   
       }
	
	return false;
	
    }
}
