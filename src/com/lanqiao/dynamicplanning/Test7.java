package com.lanqiao.dynamicplanning;

public class Test7 {
	public static void main(String[] args) {
		
		int n=4;//物品数量
		int maxWeight=10;//最大承受重量
		int v[]=new int [] {42,12,40,25};
		int w[]=new int [] {7,3,4,5};
		int dp[][]=new int [n+1][maxWeight+1];//表示n件最大重要为maxwright的最大价值
		
		for (int i = 1; i<=4; i++) {//i代表件数
			for (int j =1; j<=10; j++) {//枚举重量
				if (j-w[i-1]>0) {
					dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-w[i-1]]+v[i-1]);
				}
				else {
					dp[i][j]=dp[i-1][j];
				}
				
			}
		}
		System.out.println(dp[4][10]);
	}

}
