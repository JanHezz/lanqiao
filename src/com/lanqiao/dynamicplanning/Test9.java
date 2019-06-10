package com.lanqiao.dynamicplanning;

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		
		int sum[][];
		int n=5;
		sum=new int [n+1][n+1];
		int dp[][]=new int [n+1][n+1];  //i --j  代表原点到  i j
		for(int i=1;i<n+1;i++)
		{
			Scanner in=new Scanner(System.in);
			for(int j=1;j<=i;j++)
			{
				sum[i][j]=in.nextInt();
			}
		}
		
		for (int i = 1; i < n+1; i++) {
			
			for (int j = 1; j <=i; j++) {
				dp[i][j]=Math.max(dp[i-1][j]+sum[i][j], dp[i-1][j-1]+sum[i][j]);
			}
		}
		
		  int max=0;
			for (int j =1; j < dp.length; j++) {
				if (max<dp[n][j]) {
					max=dp[n][j];
				}
			}
          System.out.println(max);
	
		
	}

}
