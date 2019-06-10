package com.work.dataStruct.tree;

import java.util.function.IntToDoubleFunction;

import javax.print.DocFlavor.STRING;

/**
 * 
 * @author  Jan
 2018年4月19日
 *
 */
public class BinaryTreeNode {
    /*
     * 一个二叉树包括  数据、左右孩子 三部分
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
