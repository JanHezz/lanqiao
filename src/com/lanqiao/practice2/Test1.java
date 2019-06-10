package com.lanqiao.practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 问题描述
　　已知n和m，打印n^1，n^2，...，n^m。要求用静态变量实现。n^m表示n的m次方。已知n和m，打印n^1，n^2，...，n^m。要求用静态变量实现。n^m表示n的m次方。（每行显示5个数，每个数宽为12，右对齐）
样例输入
一个满足题目要求的输入范例。
例：
 *
 */
public class Test1 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();	int m=in.nextInt();
		int sum=1;
		for (int i = 1; i <=m; i++) {
			sum*=n;
			if ((i-1)%5==0) {
				System.out.println();
			}
			System.out.print(String.format("%12d", sum));
			
		}	
	}
	

}
