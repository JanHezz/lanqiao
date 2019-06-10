package com.work.dataStruct.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.work.dataStruct.huffmanTree.HuffmanTree;
import com.work.dataStruct.huffmanTree.Node;

public class TestHuffmanTree {
	public static void main(String[] args) {
	List<Node<String>>	list = new ArrayList<Node<String>>();  
	        list.add(new Node<String>("a",7));  
	        list.add(new Node<String>("b",5));  
	        list.add(new Node<String>("c",4));  
	        list.add(new Node<String>("d",2));  
	          
	        Node<String> root = HuffmanTree.createTree(list);  
	        System.out.println(HuffmanTree.breadth(root));
	        HuffmanTree.encode(root, "");
	      
	}

}
