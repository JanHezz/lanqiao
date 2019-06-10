package com.lanqiao.divideMethod;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 问题描述
　　设有有2 n（n<=6）个球队进行单循环比赛，计划在2 n – 1天内完成，每个队每天进行一场比赛。设计一个比赛的安排，使在2 n – 1天内每个队都与不同的对手比赛。
输入格式
　　输入文件matchplan.in共一行，输入n的数值。
输出格式
　　输出文件matchplan.out共（2 n – 1）行，第i行输出第i天的比赛安排。
　　格式为：<i> A-B，C-D，……。其中i是天数，A，B分别为比赛双方的编号，每行共2 n-1个比赛场次。
 * @author  Jan
 2018年5月22日
 *
 */
public class Test1 {
	
	//分治法
	static  void table(int [][] table,int n)
	{
		if (n==1) {
			table[0][0]=1;
			return ;
		}
		int m=n/2;
		table(table, m);
		
		//填充右上
		for (int i = 0; i < m; i++) {
			for (int j = m; j < n; j++) {
			table[i][j] = table[i][j - m] + m;//右上等于左上加m
			}
	 }
		//填充左下            左下等于右上
		for (int i = m; i <n; i++) {
			for (int j = 0; j <m; j++) {
			
				table[i][j]=table[i-m][j]+m;//左下等于左上加m
				
			}
			
		}
		
		// 右下区域
		for (int i = m; i < n; i++) {
		for (int j = m; j < n; j++) {
		table[i][j] = table[i - m][j - m];//右下等于左上
		}
		}

	}
	
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=(int)Math.pow(2, n);
		int [][] table=new int [m][m];
		table(table, m);
		
		for (int day = 1; day <m; day++) {
			System.out.print("<"+day+">");
			ArrayList<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i <m;i++) {
			
		if (list.contains(table[i][0])||list.contains(table[i][day])) {
			continue;
		}
                System.out.print(table[i][0]+"-");
				System.out.print(table[i][day]+" ");
				list.add(table[i][0]);
				list.add(table[i][day]);
		}
		System.out.println();
		}
	
			
			
			}		
	}


