package com.work.dataStruct.Graph;



public class Edge
{
public	String data;
public	int fromVertexIndex;//��ͷ
public	int toVertexIndex; //��β
public	Edge nextSameFromVertex;//ָ��ͷ��ͬ����һ����
public	Edge nextSameToVertex;//ָ��β��ͬ����һ����
	
	
	public Edge(String data, int fromVertexIndex, int toVertexIndex) {
		super();
		this.data = data;
		this.fromVertexIndex = fromVertexIndex;
		this.toVertexIndex = toVertexIndex;
	}
	
	
	
	
}