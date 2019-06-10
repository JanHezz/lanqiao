package com.work.dataStruct.tree;

/**
 * 
 * @author  Jan
 2018Äê4ÔÂ19ÈÕ
 *
 */
public class Test3 {
	
	public static void main(String[] args) {
		BinaryTreeNodeArray []  binaryTreeNodeArrays=new BinaryTreeNodeArray[10];
		for(int i=0;i<binaryTreeNodeArrays.length;i++)
		{
			binaryTreeNodeArrays[i]=new BinaryTreeNodeArray();
		}
	
		binaryTreeNodeArrays[0].setData(1);
		binaryTreeNodeArrays[0].setLeftChild(2);
		binaryTreeNodeArrays[0].setRightChild(3);
	binaryTreeNodeArrays[binaryTreeNodeArrays[0].getLeftChild()].setData(2);
System.out.println(binaryTreeNodeArrays[binaryTreeNodeArrays[0].getLeftChild()].getData());		
	}

}
