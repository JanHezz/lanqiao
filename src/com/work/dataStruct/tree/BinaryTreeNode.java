package com.work.dataStruct.tree;

import java.util.function.IntToDoubleFunction;

import javax.print.DocFlavor.STRING;

/**
 * 
 * @author  Jan
 2018��4��19��
 *
 */
public class BinaryTreeNode {
    /*
     * һ������������  ���ݡ����Һ��� ������
     */
    private int mData;
    private BinaryTreeNode mLeftChild;
    private BinaryTreeNode mRightChild;

    public BinaryTreeNode(int data, BinaryTreeNode leftChild, BinaryTreeNode rightChild) {
        mData = data;
        mLeftChild = leftChild;
        mRightChild = rightChild;
    }
    public BinaryTreeNode(int data)
    {
    	mData=data;
    	
    }
    public BinaryTreeNode() {}

    public int getData() {
        return mData;
    }

    public void setData(int data) {
        mData = data;
    }

    public BinaryTreeNode getLeftChild() {
        return mLeftChild;
    }

    public void setLeftChild(BinaryTreeNode leftChild) {
        mLeftChild = leftChild;
    }

    public BinaryTreeNode getRightChild() {
        return mRightChild;
    }

    public void setRightChild(BinaryTreeNode rightChild) {
        mRightChild = rightChild;
    }
}
