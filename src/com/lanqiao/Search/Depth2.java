package com.lanqiao.Search;

import java.util.concurrent.CountDownLatch;

/**
 * 题二 选数（存盘名：NOIP2002pj）
[问题描述]:已知 n 个整数 x1,x2,…,xn，以及一个整数 k(k＜n)。从n 个整数中任选 k 个整数相加，可分别得到一系列的和。例如当 n=4，k＝3，4 个整数分别为 3，7，12，19 时，可得全部的组合与它们的和为：3＋7＋12=22　　3＋7＋19＝29　　7＋12＋19＝38　　3＋12＋19＝34。现在，要求你计算出和为素数共有多少种。例如上例，只有一种的和为素数：3＋7＋19＝29。 

 * 
 * @author  Jan
 2018年5月16日
 *
 */
public class Depth2 {
	static int count=0;
	static int [] p;
	static void init(int n)
	{
		p=new int [n+1];
		for(int i=2;i<=n;i++)
		{
			p[i]=1;
		}
		for(int i=2;i<=n;i++)//筛法核心去掉2 3 4 ...的倍数剩下的就是素数
		{
			if (p[i]==1) {
				
				for(int j=2;i*j<=n;j++)
				{
					p[i*j]=0;
				}	
			}
		}
		
		
	}
	
	
	
	static void dfs(int [] a,int j,int sum,int cou,int k)
	{
		
		if (cou>=k) {
			if (p[sum]==1) {
				count++;
			}
			return ;
		}
		for(int i=j;i<a.length;i++)
		{
			sum+=a[i];
	        dfs(a, i+1, sum,cou+1,k);
	        sum-=a[i];
		}
	
		
	}
	public static void main(String[] args) {
		int [] a=new int [] {3,7,12,19};
		int k=3;
		init(10000);
		for (int i = 0; i <a.length-k+1; i++) {
			dfs(a, i+1, a[i],1,k);
		}
		System.out.println(count);
	}

}
