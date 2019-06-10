package com.lanqiao.practice2;

import java.util.Scanner;

public class Test7 {
	static int count=0;
	public static void hannio (String A,String B,String C,int n,int m)
	{
		if (n<=m) {
			count++;
			return ;
		}
		else {
			hannio(A, C, B, n-m, m);//首先把m个借助C移动到B
			count++;
			hannio(B, A, C, n-m, m);//把B上的借助A移动到C
		}
		
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		hannio("A","B", "C", n, m);
		System.out.println(count);
	}

}
