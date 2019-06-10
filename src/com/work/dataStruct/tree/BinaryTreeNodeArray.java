package com.work.dataStruct.tree;
/**
 * 数组实现，保存的不是 左右子树的引用，而是数组下标
 * @author  Jan
 2018年4月19日
 *
 */
public class BinaryTreeNodeArray {
    
    private int mData;
    private int mLeftChild;
    private int mRightChild;

    public int getData() {
        return mData;
    }

    public void setData(int data) {
        mData = data;
    }

    public int getLeftChild() {
        return mLeftChild;
    }

    public void setLeftChild(int leftChild) {
        mLeftChild = leftChild;
    }

    public int getRightChild() {
        return mRightChild;
    }

    public void setRightChild(int rightChild) {
        mRightChild = rightChild;
    }
}