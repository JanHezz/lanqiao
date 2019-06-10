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
	        // ���ߵ������Ƿ���ȷ
	        // ������ȫͼ
	        int maxEdgeNumber = vertexNumber*(vertexNumber-1); 
	        if (edgeNumber < 0 || edgeNumber > maxEdgeNumber) {
	            return;
	        }
	        // ��������ͼ����
	        // 1. �����붥�㣬��ʱ��firstIn�� firstOutΪnull;
	        ArrayList<Vertex> vertexList = new ArrayList<>();
	        for (int i=0; i<vertexNumber; i++) {
	            Vertex v = new Vertex(i+"");
	            vertexList.add(v);
	        } 
	        // 2. �����
	        // ��ά���飬ÿһ������Ԫ�أ��ֱ��������յ���±�
	      
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


