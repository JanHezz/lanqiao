package com.work.dataStruct.tree;import java.nio.Buffer;

/**
 * 二叉查找树
 * @author  Jan
 2018年4月19日
 *
 */
public class BinarySearchTree {
	private BinaryTreeNode mRoot;
	public BinarySearchTree(BinaryTreeNode root)
	{
		mRoot=root;
	}
	public BinarySearchTree()
	{
	
	}
	
	
	 public int getTreeHeight(){
	        return getHeight(mRoot);
	    }
	    /**
	     * 获得指定节点的到底部的高度
	     * @param node
	     * @return
	     */
	    public int getHeight(BinaryTreeNode node){
	        if (node == null){      //递归出口
	            return 0;
	        }
	        int leftChildHeight = getHeight(node.getLeftChild());
	        int rightChildHeight = getHeight(node.getRightChild());

	        int max = Math.max(leftChildHeight, rightChildHeight);

	        return max + 1; //加上自己本身
	    }
	
	public BinaryTreeNode search(int data)
	{
		return search(mRoot,data);	
	}
	/**
	 * 二分查找
	 * @param root 根节点
	 * @param data 需要查的数据
	 * @return
	 * 
	 *@return BinaryTreeNode
	 */
	public BinaryTreeNode search(BinaryTreeNode root,int data)
	{
		if (root==null||root.getData()==data) {
			return root;
		}
		else if (data<root.getData()) {
		return 	search(root.getLeftChild(),data );
		}
		else {
			return search(root.getRightChild(), data);
		}
		
	}
	
	
	public BinaryTreeNode insert(int data)
	{
		if (mRoot==null) {
			mRoot=new BinaryTreeNode(data);
			return mRoot;
		}
		 return searchAndInsert(null, mRoot, data);
		
		
	}
	private BinaryTreeNode searchAndInsert(BinaryTreeNode parent, BinaryTreeNode node, int data) {
	    if (node == null) {  //当前比较节点为 空，说明之前没有这个数据，直接新建、插入
	        node = new BinaryTreeNode();
	        node.setData(data);
	        if (parent != null) {    //父节点不为空，绑定关系
	            if (data < parent.getData()) {
	                parent.setLeftChild(node);
	            } else {
	                parent.setRightChild(node);
	            }
	        }
	        return node;
	    }
	    //对比的节点不为空
	    if (node.getData() == data) {    //已经有了，不用插入了
	        return node;
	    } else if (data < node.getData()) {   //比节点小，从左子树里查找、插入
	        return searchAndInsert(node, node.getLeftChild(), data);
	    } else {
	        return searchAndInsert(node, node.getRightChild(), data);
	    }
	}
	public BinaryTreeNode searchParent(int data) {
	    return searchParent(null, mRoot, data);
	}

	/**
	 * 在指定节点下 查找指定数据节点的父亲节点
	 *
	 * @param parent 当前比较节点的父节点
	 * @param node   当前比较的节点
	 * @param data   查找的数据
	 * @return
	 */
	public BinaryTreeNode searchParent(BinaryTreeNode parent, BinaryTreeNode node, int data) {
	    if (node == null) { //比较的节点为空返回空
	        return null;
	    }
	    if (node.getData() == data) {    //找到了目标节点，返回父节点
	        return parent;
	    } else if (data < node.getData()) {   //数据比当前节点小，左子树中递归查找
	        return searchParent(node, node.getLeftChild(), data);
	    } else {
	        return searchParent(node, node.getRightChild(), data);
	    }
	}
	
	
	
	
	public void Delete(int data)
	{
		if (mRoot==null||mRoot.getData()==data)//如果根节点为空，或要删除的点就是根节点
		{
			mRoot=null;
			return;
		}
	  BinaryTreeNode parent=searchParent(data);//找到父节点
	
	  if (parent==null) {
		return ;
	    }
	 BinaryTreeNode deleteNode=search(data);//找到需要删除的节点
	 System.out.println(deleteNode.getData());
	 if (deleteNode==null) {
		return;
	}
	 //叶子节点
	 if (deleteNode.getLeftChild()==null&&deleteNode.getRightChild()==null) {
		deleteNode=null;
		if (parent.getLeftChild()!=null&&parent.getLeftChild().getData()==data) {
			parent.setLeftChild(null);
		}else {
			parent.setRightChild(null);
		}
		return ;
	}
	 //要删除的节点只有左子树，左子树要继承
	 else if (deleteNode.getLeftChild()!=null&&deleteNode.getRightChild()==null) {
          if (parent.getLeftChild()!=null&&parent.getLeftChild().getData()==data) {
			  parent.setLeftChild(deleteNode.getLeftChild());
		}else {
			parent.setRightChild(deleteNode.getLeftChild());
		}	
		 deleteNode=null;
		 return ;
	}
	 //要删除的点只有右子树，右子树要继承
	 else if (deleteNode.getRightChild()!=null&&deleteNode.getLeftChild()==null) {
		 if (parent.getLeftChild()!=null&&parent.getLeftChild().getData()==data) {
			parent.setLeftChild(deleteNode.getRightChild());
		}
		 else {
			parent.setRightChild(deleteNode.getRightChild());
		}
		 deleteNode=null;
		 return ;	
	}else {
		//4.要删除的节点儿女双全，既有左子树又有右子树，需要选一个合适的节点继承，这里使用右子树中最左节点
        BinaryTreeNode copyOfDeleteNode = deleteNode;   //要删除节点的副本，指向继承节点的父节点
        BinaryTreeNode heresNode = deleteNode.getRightChild(); //要继承位置的节点，初始为要删除节点的右子树的树根
        //右子树没有左孩子了，他就是最小的，直接上位
      
        if (heresNode.getLeftChild() == null) {
            //上位后，兄弟变成了孩子
            heresNode.setLeftChild(deleteNode.getLeftChild());
        } else {
            //右子树有左孩子，循环找到最左的，即最小的
            while (heresNode.getLeftChild() != null) {
            	
                copyOfDeleteNode = heresNode;       //copyOfDeleteNode 指向继承节点的父节点
                heresNode = heresNode.getLeftChild();
            }
           
            //找到了继承节点，继承节点的右子树（如果有的话）要上移一位(没有就变为空)
            copyOfDeleteNode.setLeftChild(heresNode.getRightChild());//其实就是继承结点变成空
            //继承节点先继承家业，把自己的左右孩子变成要删除节点的孩子
            heresNode.setLeftChild(deleteNode.getLeftChild());
            heresNode.setRightChild(deleteNode.getRightChild());
        }
        //最后就是确认位置，让要删除节点的父节点认识新儿子
        if (parent.getLeftChild()!= null && parent.getLeftChild().getData() == data) {
            parent.setLeftChild(heresNode);
        } else {
            parent.setRightChild(heresNode);
        }
	}	
	}
	public void opreate(BinaryTreeNode node)
	{
		if (node==null) {
			return ;
		}
		System.out.print(node.getData());
	}
	//中序遍历
	public void itreateMediumOrder(BinaryTreeNode node)
	{
		if (node==null) {
			return ;
		}
		
		itreateMediumOrder(node.getLeftChild());
		opreate(node);
		itreateMediumOrder(node.getRightChild());
	}
	//先序遍历
	public void itreateFirstOrder(BinaryTreeNode node)
	{
		
		if (node==null) {
			return ;
		}
		opreate(node);
		itreateFirstOrder(node.getLeftChild());
		itreateFirstOrder(node.getRightChild());
	}
	//后序遍历
	public void itreateLastOrder(BinaryTreeNode node)
	{
		if (node==null) {
			return ;
		}
		itreateLastOrder(node.getLeftChild());
		itreateLastOrder(node.getRightChild());
		opreate(node);
		
	}
	public BinaryTreeNode getmRoot() {
		// TODO Auto-generated method stub
		return mRoot;
	}

}
