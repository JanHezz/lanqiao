package com.lanqiao.Search;

import java.util.LinkedList;

/**
 * 给定一个0,1矩阵，0表示可走，1表示不可走。求出从左上角到右下角的最短路径？
 * @author  Jan
 2018年5月16日
 *
 */
public class BFS1 {
	
	static int [][] dirc=new int [][] {{0,1},{0,-1},{-1,0},{1,0}};//方向上线左右
	
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
					if(rowNext==3&&columnNext==3)//找到了出口
	                {
	                    quene.clear();
	                    quene.offerFirst(next);
	                   
	                    while(next.pre!=null){
	                        quene.offerFirst(next.pre);//以前获取父节点
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




