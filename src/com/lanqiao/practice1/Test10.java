package com.lanqiao.practice1;

import java.util.function.IntConsumer;

public class Test10 {
	public static void main(String[] args) {
		
		String s="mamad";
		char [] c=s.toCharArray();
		
		int j=s.length()-1;
		int flag=0;
		int count=0;
		for (int i = 0; i <j; i++) {//从头到倒数第二个
			for (int k = j; k >=i; k--) {//从后到i开始查找
				if (k==i) {//只有一个字母的情况
					if (s.length()%2==0||flag==1) {
						System.out.println("Impossible");
						return ;
					}
					flag=1;
					count+=c.length/2-i;	
					//记录步数把单个的放中间
				}
				else if (c[i]==c[k]) {
					
					for (int k2 = k; k2 <j; k2++) {
						char t=c[k2];
					c[k2]=c[k2+1];
					c[k2+1]=t;
					count++;
					}
					j--;
					break ;
					
				}
				
				
			}
			
		}
		System.out.println(count);
		
	}

}
