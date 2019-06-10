package com.work.dataStruct.tree;

public class test4 {
	public static void main(String[] args) {
		BinarySearchTree tree=new BinarySearchTree();
		tree.insert(8);
		tree.insert(3);
		tree.insert(1);
		tree.insert(6);
		tree.insert(4);
		tree.insert(7);
		tree.insert(10);
		tree.insert(13);
		tree.insert(14);
	
		tree.itreateMediumOrder(tree.getmRoot());
		System.out.println();
		System.out.println(tree.getTreeHeight());
		
		System.out.println();
		tree.itreateFirstOrder(tree.getmRoot());
		System.out.println();
	     tree.Delete(3);
	   tree.itreateMediumOrder(tree.getmRoot());
	   
	

	}

}
