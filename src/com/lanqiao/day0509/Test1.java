package com.lanqiao.day0509;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		
	 Scanner in=new Scanner(System.in);
	 
	  String string=in.nextLine();
	  String[] a =string.split(" ");
	  int data[]=new int[a.length];
	  int heap[]=new int[a.length-1];
	  for (int i = 0; i < a.length; i++) {
			data[i]=Integer.valueOf(a[i]);
		}
	  for (int i = 0; i < heap.length; i++) {//把阶梯转换为堆
		heap[i]=data[i+1]-data[i]-1;
	}
	  //1 5   8  10   
	  int sum=0;
	  for(int i=0;i<heap.length;i+=2)//把堆做异或
	  {
		  sum^=heap[i];
	  }
	  if (sum==0) {//判断是否属于平衡
		System.out.println(-1);
		return ;
	  }
	  else {
		  for(int i=0;i<heap.length;i++)//打破平衡
		  {
			  for(int j=1;j<=heap[i];j++)//遍历走的步数
			  {
				    heap[i]-=j;
				    if (i!=0) {
					heap[i-1]+=j;
				}
				  sum=0;
				  for (int k = 0; k < heap.length; k=k+2) {
					sum^=heap[k];
				  }
				  if (sum==0) {
					System.out.println(data[i]+"   "+(data[i]+j));
					return;
				}
				  heap[i]+=j;
				  if (i!=0) {
					heap[i-1]-=j;
				}
				  
			  }
		  }
		
	}
	  
	  
	  
	  
	}
		
	}
		
	

