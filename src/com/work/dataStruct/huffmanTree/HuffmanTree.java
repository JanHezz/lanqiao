package com.work.dataStruct.huffmanTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

/**
 * 
 * @author  Jan
 2018年4月27日
 *
 */
public class HuffmanTree<T> {
	
	private static List<HaNode >mEncode=new ArrayList<HaNode>();
	
	 public static <T> Node<T> createTree(List<Node<T>> nodes){  
	        while(nodes.size() > 1){  
	            Collections.sort(nodes);  
	            Node<T> left = nodes.get(nodes.size()-1);  
	            Node<T> right = nodes.get(nodes.size()-2);  
	            Node<T> parent = new Node<T>(null, left.getWeight()+right.getWeight());  
	            parent.setLeft(left);  
	            parent.setRight(right);  
	            nodes.remove(left);  
	            nodes.remove(right);  
	            nodes.add(parent);  
	        }  
	        return nodes.get(0);  
	    }  
	      
	    public static <T> List<Node<T>> breadth(Node<T> root){  
	        List<Node<T>> list = new ArrayList<Node<T>>();  
	        Queue<Node<T>> queue = new ArrayDeque<Node<T>>();  
	          
	        if(root != null){  
	            queue.offer(root);  
	        }  
	          
	        while(!queue.isEmpty()){ 
	        	
	            list.add(queue.peek());  
	            Node<T> node = queue.poll();  
	              
	            if(node.getLeft() != null){  
	                queue.offer(node.getLeft());  
	            }  
	              
	            if(node.getRight() != null){  
	                queue.offer(node.getRight());  
	            }  
	        }  
	        return list;  
	    }  
	    
	    //编码
	    public static<T>  void  encode(Node<T> root,String encode){  
	       if (root==null) {
			 return ;
		}
	       //当该节点没有根节点时进行编码
	     if (root.getLeft()==null&&root.getRight()==null) {
	          mEncode.add(new HaNode(root.getData(),encode));
			  System.out.println(root.getData()+encode);
		   }
	          encode(root.getLeft(),encode+0);//左子集加0
	          encode(root.getRight(),encode+1);//右子集加1
	          
	          
	    
	        
	    }  
	    
	    

}
