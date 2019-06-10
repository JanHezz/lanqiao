package com.work.dataStruct.tree;

public class BinaryTree {
	 private BinaryTreeNode mRoot;   //���ڵ�
	    public BinaryTree() {
	    }

	    public BinaryTree(BinaryTreeNode root) {
	        mRoot = root;
	    }

	    public BinaryTreeNode getRoot() {
	        return mRoot;
	    }

	    public void setRoot(BinaryTreeNode root) {
	        mRoot = root;
	    }
	    public void insertAsLeftChild(BinaryTreeNode child){
	        checkTreeEmpty();
	        mRoot.setLeftChild(child);
	    }

	    public void insertAsRightChild(BinaryTreeNode child){
	        checkTreeEmpty();
	        mRoot.setRightChild(child);
	    }

	    private void checkTreeEmpty() {
	        if (mRoot == null){
	            throw new IllegalStateException("Can't insert to a null tree! Did you forget set value for root?");
	        }
	    }
	    /**
	     * 
	     * @param node �ڵ�
	     * 
	     *@return void
	     */
	    public void deleteNode(BinaryTreeNode node){
	        checkTreeEmpty();
	        if (node == null){  //�ݹ����
	            return;
	        }
	        deleteNode(node.getLeftChild());//����ýڵ����ڵ�
	        deleteNode(node.getRightChild());//����ҽڵ�
	        node = null;
	    }
	    //�����
	    public void clear(){
	        if (mRoot != null){
	            deleteNode(mRoot);
	        }
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
	    public int getSize(){
	        return getChildSize(mRoot);
	    }

	    /**
	     * ���ָ���ڵ���ӽڵ����
	     * @param node
	     * @return
	     */
	    public int getChildSize(BinaryTreeNode node){
	        if (node == null){
	            return 0;
	        }
	        int leftChildSize = getChildSize(node.getLeftChild());
	        int rightChildSize = getChildSize(node.getRightChild());

	        return leftChildSize + rightChildSize + 1;
	    }
	    /**
	     * ���ָ���ڵ�ĸ��׽ڵ�
	     * @param node
	     * @return
	     */
	    public BinaryTreeNode getParent(BinaryTreeNode node) {
	        if (mRoot == null || mRoot == node) {   //����ǿ�������������ڵ���Ǹ��ڵ㣬���ؿ�
	            return null;
	        } else {
	            return getParent(mRoot, node);  //����ݹ���� ���׽ڵ�
	        }
	    }

	    /**
	     * �ݹ�Ա� �ڵ�ĺ��ӽڵ� �� ָ���ڵ� �Ƿ�һ��
	     *
	     * @param subTree �Ӷ��������ڵ�
	     * @param node    ָ���ڵ�
	     * @return
	     */
	    public BinaryTreeNode getParent(BinaryTreeNode subTree, BinaryTreeNode node) {
	        if (subTree == null) {       //�������Ϊ�գ���û�и��׽ڵ㣬�ݹ���� 1
	            return null;
	        }
	        //����������ڵ�����Һ���֮һ��Ŀ��ڵ�һ��
	        if (subTree.getLeftChild() == node || subTree.getRightChild() == node) {    //�ݹ���� 2
	            return subTree;
	        }
	        //��Ҫ��������ڵ����������
	        BinaryTreeNode parent;
	        if ((parent = getParent(subTree.getLeftChild(), node)) != null) { //�������ڵ����ָ���ڵ㣬����
	            return parent;
	        } else {
	            return getParent(subTree.getRightChild(), node);    //�����������ҿ�
	        }
	        
	        ///
	    }
	    //�������
	        public void iterateFirstOrder(BinaryTreeNode node){
	            if (node == null){
	                return;
	            }
	            operate(node);
	            iterateFirstOrder(node.getLeftChild());
	            iterateFirstOrder(node.getRightChild());
	        }
	        
	        public void operate(BinaryTreeNode node){
	            if (node == null){
	                return;
	            }
	            System.out.print(node.getData()+" ");
	        }
	        
	        /**
	         * �������
	         * @param node
	         * 
	         *@return void
	         */
	        public void iterateMediumOrder(BinaryTreeNode node){
	            if (node == null){
	                return;
	            }
	            iterateMediumOrder(node.getLeftChild());
	            operate(node);
	            iterateMediumOrder(node.getRightChild());
	        }
	        /**
	         * �������
	         * @param node
	         */
	        public void iterateLastOrder(BinaryTreeNode node){
	            if (node == null){
	                return;
	            }
	            iterateLastOrder(node.getLeftChild());
	            iterateLastOrder(node.getRightChild());
	            operate(node);
	        }

}
