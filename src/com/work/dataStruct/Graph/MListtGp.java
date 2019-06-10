package com.work.dataStruct.Graph;

import java.util.ArrayList;
import java.util.List;

/**
 * �����ڽӱ�����ͼ��
 * @author  Jan
 2018��5��7��
 *
 */
public class MListtGp {
	
	ArrayList<Vertex1> vertexList ;
	
	   List<Edge1> rawEdgeList ;
	
	public void init()
	{
		  vertexList = new ArrayList<>();
	        for (int i=0; i<12; i++) {
	            Vertex1 v = new Vertex1(i);
	            vertexList.add(v);
	        } 
	        // 2. �����
	        // ��ά���飬ÿһ������Ԫ�أ��ֱ��������յ���±�
	      
	       rawEdgeList = new ArrayList<Edge1>(){{
	            add(new Edge1(9, 0, 1));
	            add(new Edge1(7, 0, 2));
	            add(new Edge1(3, 0, 3));
	            add(new Edge1(2, 0, 4));
	            add(new Edge1(4, 1, 5));
	            add(new Edge1(2, 1, 6));
	            add(new Edge1(1, 1, 7));
	            add(new Edge1(2, 2, 5));
	            add(new Edge1(7, 2, 6));
	            add(new Edge1(11, 3, 7));
	            add(new Edge1(11, 4, 6));
	            add(new Edge1(8, 4, 7));
	            add(new Edge1(6, 5, 8));
	            add(new Edge1(5, 5, 9));
	            add(new Edge1(4, 6, 8));
	            add(new Edge1(3, 6, 9));
	            add(new Edge1(5, 7, 9));
	            add(new Edge1(6, 7, 10));
	            add(new Edge1(4, 8, 11));
	            add(new Edge1(2, 9, 11));
	            add(new Edge1(5, 10, 11));

	        }};
	       for (Edge1 edge1 : rawEdgeList) {
			 Insert(edge1);
		}
		
	}
	public void Insert(Edge1 e1)
	{
		Vertex1 v1=vertexList.get(e1.fromIndex);
		Vertex1 v2=vertexList.get(e1.toIndex);
		
		Edge1 from=v1.next;
		Edge1 to=v2.next;
		
		if (from==null) {
			v1.next=e1;
		} else {
			while(from.fromEdgeNext!=null)
			{
				from=from.fromEdgeNext;
			}
			from.fromEdgeNext=e1;

		}
		
		if (to==null) {
			v2.next=e1;
		} else {
			while(to.toEdgeNext!=null)
			{
				to=to.toEdgeNext;
			}
			to.toEdgeNext=e1;

		}
		
		
		
	}
	public void print()
	{
		
		
	}
	
	
	
	
	class Vertex1
	{
	    int	data;
		Edge1 next;
		
		public Vertex1(int data) {
			super();
			this.data = data;
		} 
		
		
	}
	class Edge1
	{
	 int mark;
	 int fromIndex;//���������λ��
	 int toIndex;//�뻡���׵�λ��
	 Edge1 fromEdgeNext;//ָ����һ��������from����ı�
	 Edge1 toEdgeNext;//ָ����һ��������to����ı�
	 int info;
	 
	public Edge1(int info, int fromIndex, int toIndex) {
		super();
		this.info = info;
		this.fromIndex = fromIndex;
		this.toIndex = toIndex;
	}
	 
		
		
	}

}
