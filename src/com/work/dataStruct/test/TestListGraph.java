package com.work.dataStruct.test;

import javax.swing.plaf.TreeUI;

import com.work.dataStruct.Graph.ListGraph1;

public class TestListGraph {
	 public static void main(String[] args){
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

	        ListGraph1 pG;

	

	       
	            pG = new ListGraph1(vexs, edges,true);
	            pG.print();   // ¥Ú”°Õº 
	       
	        





	    }


}
