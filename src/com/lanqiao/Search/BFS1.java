package com.lanqiao.Search;

import java.util.LinkedList;

/**
 * ����һ��0,1����0��ʾ���ߣ�1��ʾ�����ߡ���������Ͻǵ����½ǵ����·����
 * @author  Jan
 2018��5��16��
 *
 */
public class BFS1 {
	
	static int [][] dirc=new int [][] {{0,1},{0,-1},{-1,0},{1,0}};//������������
	
	 int[][] array={
	            {0,0,1,0},
	            {0,0,1,0},
	            {0,0,0,0},
	            {0,0,1,0}
	           };
	 public static void main(String[] args) {
		new BFS1().BFS();
	}
	 
	 class Node
	 {
		 int row;
		 int column;
		 int round;
		  Node pre;
	         Node(int row,int column,int round,Node pre) {
	            this.row=row;
	            this.column=column;
	            this.round=round;
	            this.pre=pre;
	        }
	 }
		 public void BFS()
		 {
			Node satrt=new Node(0, 0, 0, null);
			
			
			LinkedList<Node> quene=new LinkedList<Node>();
			quene.offer(satrt);
			while(!quene.isEmpty())
			{
				
				Node temp=quene.poll();
				
				for (int i = 0; i < dirc.length; i++) {
					int rowNext=temp.row+dirc[i][0];
					int columnNext=temp.column+dirc[i][1];
				
					if (rowNext>3||rowNext<0||columnNext>3||columnNext<0) {
						continue;
					}
					if (array[rowNext][columnNext]==1) {
						continue;
					}
					Node next=new Node(rowNext, columnNext, temp.round+1, temp);
					if(rowNext==3&&columnNext==3)//�ҵ��˳���
	                {
	                    quene.clear();
	                    quene.offerFirst(next);
	                   
	                    while(next.pre!=null){
	                        quene.offerFirst(next.pre);//��ǰ��ȡ���ڵ�
	                        next=next.pre;
	                    }
	                    for(Node node:quene)
	                    {
	                        System.out.println("("+node.row+","+node.column+"),");
	                    }
	                }
					array[rowNext][columnNext]=1;

					quene.offer(next);
					
					
				}
			}
			
			 
			 
		 }
		 
		 
	 }




