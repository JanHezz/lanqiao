package com.work.dataStruct.huffmanTree;

public class HaNode<T> {
	public T source;
	public String encode;
	public HaNode() {
	
		// TODO Auto-generated constructor stub
	}
	
	public HaNode(T source, String encode) {
		super();
		this.source = source;
		this.encode = encode;
	}

	public Object getSource() {
		return this.source;
	}
	public void setSource(T source) {
		this.source = source;
	}
	public String getEncode() {
		return this.encode;
	}
	public void setEncode(String encode) {
		this.encode = encode;
	}
	

	
	
}
