package com.work.dataStruct.test;

import com.work.dataStruct.Graph.Graph2;

public class TestGraph2 {
	public static void main(String[] args) {
	
		 char[] vexs = {'A', 'B', 'C', 'D', 'E', 'F', 'G','H','I','J','K'};
	        char[][] edges = new char[][]{
	            {'A', 'C'}, 
	            {'A', 'D'}, 
	            {'A', 'F'}, 
	            {'B', 'C'}, 
	            {'C', 'D'}, 
	            {'E', 'G'}, 
	            {'D', 'G'},
	            {'I','J'},
	            {'J','G'},};
	            Graph2 g=new Graph2(vexs, edges,true);
	         //   g.setEndges("A", "B");
	            g.print();
	            
	            
		
		
	}

}
