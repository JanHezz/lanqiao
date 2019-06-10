package com.lanqiao.practice1;

import java.util.Scanner;

public class Test6 {
	static void F(int n)
	{
		if (n==1) {
			System.out.print('A');
			return ;
		}
		else
		{
			F(n-1);
			char a=(char) ('A'+n-1);
			System.out.print(a);
			F(n-1);
			
		}
		
		
	}
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		F(in.nextInt());
	}

}
