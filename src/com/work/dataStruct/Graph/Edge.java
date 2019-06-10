package com.work.dataStruct.Graph;



public class Edge
{
public	String data;
public	int fromVertexIndex;//弧头
public	int toVertexIndex; //弧尾
public	Edge nextSameFromVertex;//指向弧头相同的下一个边
public	Edge nextSameToVertex;//指向弧尾相同的下一个边
	
	
	public Edge(String data, int fromVertexIndex, int toVertexIndex) {
		super();
		this.data = data;
		this.fromVertexIndex = fromVertexIndex;
		this.toVertexIndex = toVertexIndex;
	}
	
	
	
	
}