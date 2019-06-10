package com.lanqiao.practice2;

import java.util.Scanner;

/**
 * 问题描述
　　有一个箱子容量为V（正整数，0＜＝V＜＝20000），同时有n个物品（0＜n＜＝30），每个物品有一个体积（正整数）。
　　要求n个物品中，任取若干个装入箱内，使箱子的剩余空间为最小。
输入格式
　　第一行为一个整数，表示箱子容量；
　　第二行为一个整数，表示有n个物品；
　　接下来n行，每行一个整数表示这n个物品的各自体积。
 * 
 * @author  Jan
 2018年5月22日
 *
 */
public class Test10 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int v=in.nextInt();
		int n=in.nextInt();
		int [][]dp=new int[n+1][v+1];//代表 n件 装入体积为v 的最大值
		for (int i = 1; i <=n; i++) {
			int t=in.nextInt();			
			for (int j = 1; j <=v; j++) {
				
				if (j>=t) {
					dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-t]+t);
				}
				else {
					dp[i][j]=dp[i-1][j];
				}
				
			}
			
		}
		System.out.println(v-dp[n][v]);
		
	}

}
