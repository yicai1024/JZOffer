package tree;

public class TreeMirror {
	
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	
	//如果有左右子节点，就依次交换根节点的左右子节点（交换节点个交换两个int类型没有本质差别，都需要存一个中间变量来进行交换）
    public void Mirror(TreeNode root) {
    	if(root ==null || (root.left ==null&&root.right ==null)){//根本不存在或者到了叶节点
    		return;
    	}else{
    		TreeNode temp = root.left;
    		root.left=root.right;
    		root.right=temp;
    	}
    	  
    	if(root.left !=null)//递归流程
    		Mirror(root.left);
    	if(root.right !=null)
    		Mirror(root.right);
        
    }

}
