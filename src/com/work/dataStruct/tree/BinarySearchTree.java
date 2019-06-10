package com.work.dataStruct.tree;import java.nio.Buffer;

/**
 * ���������
 * @author  Jan
 2018��4��19��
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
	     * ���ָ���ڵ�ĵ��ײ��ĸ߶�
	     * @param node
	     * @return
	     */
	    public int getHeight(BinaryTreeNode node){
	        if (node == null){      //�ݹ����
	            return 0;
	        }
	        int leftChildHeight = getHeight(node.getLeftChild());
	        int rightChildHeight = getHeight(node.getRightChild());

	        int max = Math.max(leftChildHeight, rightChildHeight);

	        return max + 1; //�����Լ�����
	    }
	
	public BinaryTreeNode search(int data)
	{
		return search(mRoot,data);	
	}
	/**
	 * ���ֲ���
	 * @param root ���ڵ�
	 * @param data ��Ҫ�������
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
	    if (node == null) {  //��ǰ�ȽϽڵ�Ϊ �գ�˵��֮ǰû��������ݣ�ֱ���½�������
	        node = new BinaryTreeNode();
	        node.setData(data);
	        if (parent != null) {    //���ڵ㲻Ϊ�գ��󶨹�ϵ
	            if (data < parent.getData()) {
	                parent.setLeftChild(node);
	            } else {
	                parent.setRightChild(node);
	            }
	        }
	        return node;
	    }
	    //�ԱȵĽڵ㲻Ϊ��
	    if (node.getData() == data) {    //�Ѿ����ˣ����ò�����
	        return node;
	    } else if (data < node.getData()) {   //�Ƚڵ�С��������������ҡ�����
	        return searchAndInsert(node, node.getLeftChild(), data);
	    } else {
	        return searchAndInsert(node, node.getRightChild(), data);
	    }
	}
	public BinaryTreeNode searchParent(int data) {
	    return searchParent(null, mRoot, data);
	}

	/**
	 * ��ָ���ڵ��� ����ָ�����ݽڵ�ĸ��׽ڵ�
	 *
	 * @param parent ��ǰ�ȽϽڵ�ĸ��ڵ�
	 * @param node   ��ǰ�ȽϵĽڵ�
	 * @param data   ���ҵ�����
	 * @return
	 */
	public BinaryTreeNode searchParent(BinaryTreeNode parent, BinaryTreeNode node, int data) {
	    if (node == null) { //�ȽϵĽڵ�Ϊ�շ��ؿ�
	        return null;
	    }
	    if (node.getData() == data) {    //�ҵ���Ŀ��ڵ㣬���ظ��ڵ�
	        return parent;
	    } else if (data < node.getData()) {   //���ݱȵ�ǰ�ڵ�С���������еݹ����
	        return searchParent(node, node.getLeftChild(), data);
	    } else {
	        return searchParent(node, node.getRightChild(), data);
	    }
	}
	
	
	
	
	public void Delete(int data)
	{
		if (mRoot==null||mRoot.getData()==data)//������ڵ�Ϊ�գ���Ҫɾ���ĵ���Ǹ��ڵ�
		{
			mRoot=null;
			return;
		}
	  BinaryTreeNode parent=searchParent(data);//�ҵ����ڵ�
	
	  if (parent==null) {
		return ;
	    }
	 BinaryTreeNode deleteNode=search(data);//�ҵ���Ҫɾ���Ľڵ�
	 System.out.println(deleteNode.getData());
	 if (deleteNode==null) {
		return;
	}
	 //Ҷ�ӽڵ�
	 if (deleteNode.getLeftChild()==null&&deleteNode.getRightChild()==null) {
		deleteNode=null;
		if (parent.getLeftChild()!=null&&parent.getLeftChild().getData()==data) {
			parent.setLeftChild(null);
		}else {
			parent.setRightChild(null);
		}
		return ;
	}
	 //Ҫɾ���Ľڵ�ֻ����������������Ҫ�̳�
	 else if (deleteNode.getLeftChild()!=null&&deleteNode.getRightChild()==null) {
          if (parent.getLeftChild()!=null&&parent.getLeftChild().getData()==data) {
			  parent.setLeftChild(deleteNode.getLeftChild());
		}else {
			parent.setRightChild(deleteNode.getLeftChild());
		}	
		 deleteNode=null;
		 return ;
	}
	 //Ҫɾ���ĵ�ֻ����������������Ҫ�̳�
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
		//4.Ҫɾ���Ľڵ��Ů˫ȫ��������������������������Ҫѡһ�����ʵĽڵ�̳У�����ʹ��������������ڵ�
        BinaryTreeNode copyOfDeleteNode = deleteNode;   //Ҫɾ���ڵ�ĸ�����ָ��̳нڵ�ĸ��ڵ�
        BinaryTreeNode heresNode = deleteNode.getRightChild(); //Ҫ�̳�λ�õĽڵ㣬��ʼΪҪɾ���ڵ��������������
        //������û�������ˣ���������С�ģ�ֱ����λ
      
        if (heresNode.getLeftChild() == null) {
            //��λ���ֵܱ���˺���
            heresNode.setLeftChild(deleteNode.getLeftChild());
        } else {
            //�����������ӣ�ѭ���ҵ�����ģ�����С��
            while (heresNode.getLeftChild() != null) {
            	
                copyOfDeleteNode = heresNode;       //copyOfDeleteNode ָ��̳нڵ�ĸ��ڵ�
                heresNode = heresNode.getLeftChild();
            }
           
            //�ҵ��˼̳нڵ㣬�̳нڵ��������������еĻ���Ҫ����һλ(û�оͱ�Ϊ��)
            copyOfDeleteNode.setLeftChild(heresNode.getRightChild());//��ʵ���Ǽ̳н���ɿ�
            //�̳нڵ��ȼ̳м�ҵ�����Լ������Һ��ӱ��Ҫɾ���ڵ�ĺ���
            heresNode.setLeftChild(deleteNode.getLeftChild());
            heresNode.setRightChild(deleteNode.getRightChild());
        }
        //������ȷ��λ�ã���Ҫɾ���ڵ�ĸ��ڵ���ʶ�¶���
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
	//�������
	public void itreateMediumOrder(BinaryTreeNode node)
	{
		if (node==null) {
			return ;
		}
		
		itreateMediumOrder(node.getLeftChild());
		opreate(node);
		itreateMediumOrder(node.getRightChild());
	}
	//�������
	public void itreateFirstOrder(BinaryTreeNode node)
	{
		
		if (node==null) {
			return ;
		}
		opreate(node);
		itreateFirstOrder(node.getLeftChild());
		itreateFirstOrder(node.getRightChild());
	}
	//�������
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
