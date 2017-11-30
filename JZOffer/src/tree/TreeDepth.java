package tree;



public class TreeDepth {
	
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val; //��¼tree�����

	    }
	}

	
	    public int TreeDepth(TreeNode root) {
	        int leftdepth=0,rightdepth = 0;//����Ҫ��һ�����ڵݹ������ֵ����¼treedepth
	        if(root !=null){        	
	        	if(root.left !=null){
	        		leftdepth++;
	        		leftdepth=TreeDepth(root.left);
	        	}
	        	if(root.right !=null){
	        		rightdepth++;
	        		rightdepth=TreeDepth(root.right);
	        	}
	        	
	        	root.val = leftdepth>rightdepth?leftdepth+1:rightdepth+1;
	        	return root.val;
	        }else
	        	return 0;
	        
	    	
	    	
	    }
}
