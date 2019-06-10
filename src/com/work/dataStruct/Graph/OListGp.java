package com.work.dataStruct.Graph;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * ͼ��ʮ�������ʾ
 * @author  Jan
 2018��5��7��
 *
 */
public class OListGp {
	List<Vertex> mVertex;
	
	List<Edge> edgeslist;

	int mVCount;
	int edgeMAX;
	int edgeNow;
	
	public OListGp(List<Vertex> mVertex, List<Edge> edgeslist) {
		super();
		this.mVertex = mVertex;
		mVCount=mVertex.size();
		edgeMAX=mVCount*(mVCount-1);
	      edgeNow=edgeslist.size();
	      if (edgeNow<edgeMAX) {
			this.edgeslist = edgeslist;
			Init();
		  }
	      else {
			System.out.println("�ߴ������ֵ");
	    	  return;
		}
		
	}
	public void Init()
	{
	for (Edge edge : edgeslist) {
		insertEdge(edge, mVertex);
	}
		
	}
	 public  void insertEdge(Edge edge, List<Vertex> vertexList) {
	        int fromVertexIndex = edge.fromVertexIndex;
	        int toVertexIndex = edge.toVertexIndex;
	        Vertex fromVertex = vertexList.get(fromVertexIndex);
	        Vertex toVertex = vertexList.get(toVertexIndex);

	        if (fromVertex.firstOut == null) {
	            //���뵽����ĳ�������
	            fromVertex.firstOut = edge;
	        } else {
	            // ���뵽edge��nextSameFromVertex����
	            Edge tempEdge = fromVertex.firstOut;
	            //�ҵ����һ��Edge
	            while (tempEdge.nextSameFromVertex != null) {
	                tempEdge = tempEdge.nextSameFromVertex;
	            }
	            tempEdge.nextSameFromVertex = edge; 
	        }
	        if (toVertex.firstIn == null) {
	            //���뵽������������
	            toVertex.firstIn = edge;            
	        } else {
	            // ���뵽edge��nextSameToVertex����
	            Edge tempEdge = toVertex.firstIn;
	            //�ҵ����һ��Edge
	            while (tempEdge.nextSameToVertex != null) {
	                tempEdge = tempEdge.nextSameToVertex;
	            }
	            tempEdge.nextSameToVertex = edge; 
	        }
	    }
	
	 public  void printVertexAndEdges() {
 for (Vertex vertex : mVertex) {
	            //������
	            String infoIn = String.format("vertex: %3s - its in-edge are: ", vertex.data);
	            Edge edge = vertex.firstIn;
	            while (edge != null) {
	                infoIn += String.format("(from: %s, to: %s, data: %s)", edge.fromVertexIndex, edge.toVertexIndex, edge.data);
	                edge = edge.nextSameToVertex;
	            }
	            System.out.println(infoIn);
	            //�������
	            String infoOut = String.format("vertex: %3s - its out-edge are: ", vertex.data);
	            Edge edgeOut = vertex.firstOut;
	            while (edgeOut != null) {
	                infoOut += String.format("(from: %s, to: %d, data: %s)", edgeOut.fromVertexIndex, edgeOut.toVertexIndex, edgeOut.data);
	                edgeOut = edgeOut.nextSameFromVertex;
	            }
	            System.out.println(infoOut);
	        }
	    }

	}
	
	


