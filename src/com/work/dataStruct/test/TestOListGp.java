package com.work.dataStruct.test;

import java.util.ArrayList;
import java.util.List;

import com.work.dataStruct.Graph.Edge;
import com.work.dataStruct.Graph.OListGp;
import com.work.dataStruct.Graph.Vertex;

public class TestOListGp {
	 public static void main(String[] args) {
	        int vertexNumber = 12;
	        int edgeNumber = 21;
	        // 检查边的数量是否正确
	        // 有向完全图
	        int maxEdgeNumber = vertexNumber*(vertexNumber-1); 
	        if (edgeNumber < 0 || edgeNumber > maxEdgeNumber) {
	            return;
	        }
	        // 输入有向图数据
	        // 1. 先输入顶点，暂时令firstIn， firstOut为null;
	        ArrayList<Vertex> vertexList = new ArrayList<>();
	        for (int i=0; i<vertexNumber; i++) {
	            Vertex v = new Vertex(i+"");
	            vertexList.add(v);
	        } 
	        // 2. 输入边
	        // 二维数组，每一行两个元素，分别是起点和终点的下标
	      
	        List<Edge> rawEdgeList = new ArrayList<Edge>(){{
	            add(new Edge(9+"", 0, 1));
	            add(new Edge(7+"", 0, 2));
	            add(new Edge(3+"", 0, 3));
	            add(new Edge(2+"", 0, 4));
	            add(new Edge(4+"", 1, 5));
	            add(new Edge(2+"", 1, 6));
	            add(new Edge(1+"", 1, 7));
	            add(new Edge(2+"", 2, 5));
	            add(new Edge(7+"", 2, 6));
	            add(new Edge(11+"", 3, 7));
	            add(new Edge(11+"", 4, 6));
	            add(new Edge(8+"", 4, 7));
	            add(new Edge(6+"", 5, 8));
	            add(new Edge(5+"", 5, 9));
	            add(new Edge(4+"", 6, 8));
	            add(new Edge(3+"", 6, 9));
	            add(new Edge(5+"", 7, 9));
	            add(new Edge(6+"", 7, 10));
	            add(new Edge(4+"", 8, 11));
	            add(new Edge(2+"", 9, 11));
	            add(new Edge(5+"", 10, 11));

	        }};
	        OListGp oListGp=new OListGp(vertexList, rawEdgeList);
	        oListGp.printVertexAndEdges(); 
	       
	    }
	}


