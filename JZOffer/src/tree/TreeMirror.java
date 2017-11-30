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
	
	//����������ӽڵ㣬�����ν������ڵ�������ӽڵ㣨�����ڵ����������int����û�б��ʲ�𣬶���Ҫ��һ���м���������н�����
    public void Mirror(TreeNode root) {
    	if(root ==null || (root.left ==null&&root.right ==null)){//���������ڻ��ߵ���Ҷ�ڵ�
    		return;
    	}else{
    		TreeNode temp = root.left;
    		root.left=root.right;
    		root.right=temp;
    	}
    	  
    	if(root.left !=null)//�ݹ�����
    		Mirror(root.left);
    	if(root.right !=null)
    		Mirror(root.right);
        
    }

}
