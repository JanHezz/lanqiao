package com.work.dataStruct.Graph;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 图的十字链表表示
 * @author  Jan
 2018年5月7日
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
			System.out.println("边大于最大值");
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
	            //插入到顶点的出边属性
	            fromVertex.firstOut = edge;
	        } else {
	            // 插入到edge的nextSameFromVertex属性
	            Edge tempEdge = fromVertex.firstOut;
	            //找到最后一个Edge
	            while (tempEdge.nextSameFromVertex != null) {
	                tempEdge = tempEdge.nextSameFromVertex;
	            }
	            tempEdge.nextSameFromVertex = edge; 
	        }
	        if (toVertex.firstIn == null) {
	            //插入到顶点的入边属性
	            toVertex.firstIn = edge;            
	        } else {
	            // 插入到edge的nextSameToVertex属性
	            Edge tempEdge = toVertex.firstIn;
	            //找到最后一个Edge
	            while (tempEdge.nextSameToVertex != null) {
	                tempEdge = tempEdge.nextSameToVertex;
	            }
	            tempEdge.nextSameToVertex = edge; 
	        }
	    }
	
	 public  void printVertexAndEdges() {
 for (Vertex vertex : mVertex) {
	            //输出入度
	            String infoIn = String.format("vertex: %3s - its in-edge are: ", vertex.data);
	            Edge edge = vertex.firstIn;
	            while (edge != null) {
	                infoIn += String.format("(from: %s, to: %s, data: %s)", edge.fromVertexIndex, edge.toVertexIndex, edge.data);
	                edge = edge.nextSameToVertex;
	            }
	            System.out.println(infoIn);
	            //输出出度
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
	
	


