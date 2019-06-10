package com.work.dataStruct.huffmanTree;

public class Node<T> implements Comparable<Node<T>> {
	    private T data;  
	    private double weight;  
	    private Node<T> left;  
	    private Node<T> right; 
	   

	public Node() {}

	public Node(T data, double weight) {
	
		this.data = data;
		this.weight = weight;
	}







	public T getData() {
			return this.data;
		}






		public void setData(T data) {
			this.data = data;
		}






		public double getWeight() {
			return this.weight;
		}






		public void setWeight(double weight) {
			this.weight = weight;
		}






		public Node<T> getLeft() {
			return this.left;
		}






		public void setLeft(Node<T> left) {
			this.left = left;
		}






		public Node<T> getRight() {
			return this.right;
		}


		public void setRight(Node<T> right) {
			this.right = right;
		}






	@Override
		public String toString() {
			return "Node [data=" + this.data + ", weight=" + this.weight + ", left=" + this.left + ", right="
					+ this.right + "]";
		}

	@Override
	public int compareTo(Node<T> other) {
		// TODO Auto-generated method stub
		  if(other.getWeight() > this.getWeight()){  
	            return 1;  
	        }  
	        if(other.getWeight() < this.getWeight()){  
	            return -1;  
	        }       
	        return 0;  
	}

}
