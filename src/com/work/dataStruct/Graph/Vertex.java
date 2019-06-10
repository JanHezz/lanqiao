package com.work.dataStruct.Graph;



public class Vertex {
public	String data;
public	Edge firstIn;//该顶点的第一条入弧
public	Edge firstOut;//该顶点第一条出弧  
	
	public Vertex(String data) {
		super();
		this.data = data;
	}
	
}
