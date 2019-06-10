package com.lanqiao.practice3;

import java.util.Scanner;

/**
 * 
问题描述
　　每个物品有一定的体积（废话），不同的物品组合，装入背包会战用一定的总体积。假如每个物品有无限件可用，那么有些体积是永远也装不出来的。为了尽量装满背包，附中的OIER想要研究一下物品不能装出的最大体积。题目保证有解，如果是有限解，保证不超过2，000，000，000
　　如果是无限解，则输出0
输入格式
　　第一行一个整数n（n<=10），表示物品的件数
　　第2行到N+1行: 每件物品的体积(1<= <=500)
输出格式
　　一个整数ans，表示不能用这些物品得到的最大体积。
样例输入
3
3
6
10
样例输出
17

 * 
 * @author  Jan
 2018年5月23日
 *
 */
public class Test5 {	 
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int maxnum=100000;
		int num[]=new int [100001];
		int n=in.nextInt();
		int a[]=new int [n];
		for (int i = 0; i < a.length; i++) {
			a[i]=in.nextInt();
		}
		num[0]=1;
		for (int i = 0; i < a.length; i++) {//计算出由所选数所组成的数
			for (int j =a[i]; j <= maxnum; j++){
				if (num[j-a[i]]==1) { //i=0时，j为a[0]的倍数
					num[j]=1;
				}	
			}
			
		}
		for (int i = maxnum; i>0; i--) {
			if (num[i]!=1) {//存在就输出
				System.out.println(i);
				return ; //输出后终止
			}
		}
		
	
            //否则是无限解
			System.out.println(0);
		
	}
	

}