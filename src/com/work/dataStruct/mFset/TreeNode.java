package com.work.dataStruct.mFset;

public class TreeNode {

	private Object data;
	private TreeNode parentTree;
	private int count=-1;
	public TreeNode() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TreeNode(Object data, TreeNode parentTree) {
		super();
		this.data = data;
		this.parentTree = parentTree;
	}
	public TreeNode(Object data) {
		super();
		this.data = data;
	}
	
	
	
	public int getCount() {
		return this.count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Object getData() {
		return this.data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public TreeNode getParentTree() {
		return this.parentTree;
	}
	public void setParentTree(TreeNode parentTree) {
		this.parentTree = parentTree;
	}
	
	
	
}
