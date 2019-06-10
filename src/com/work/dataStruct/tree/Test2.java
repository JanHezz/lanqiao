package com.work.dataStruct.tree;

public class Test2 {
	
	/*
	 *二叉树链表形式实现 
	 *
	*/
	public static void main(String[] args) {
	BinaryTree binaryTree=new BinaryTree(new BinaryTreeNode(1, new BinaryTreeNode(2, null, null), 
			new BinaryTreeNode(3, null, null)));
	binaryTree.getRoot().getLeftChild().setLeftChild(new BinaryTreeNode(4));
	binaryTree.getRoot().getLeftChild().setRightChild(new BinaryTreeNode(5));
	binaryTree.iterateMediumOrder(binaryTree.getRoot().getLeftChild());
	System.out.println();
	binaryTree.iterateFirstOrder(binaryTree.getRoot().getLeftChild());
	System.out.println(binaryTree.getTreeHeight());
	}
}
	


