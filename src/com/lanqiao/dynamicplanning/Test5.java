package com.lanqiao.dynamicplanning;

/**
 * 给定一个矩阵m，从左上角开始每次只能向右走或者向下走，最后达到右下角的位置，路径中所有数字累加起来就是路径和，返回所有路径的最小路径和，如果给定的m如下，那么路径1,3,1,0,6,1,0就是最小路径和，返回12.

1 3 5 9

8 1 3 4

5 0 6 1

8 8 4 0
 * 
 * 
 * @author  Jan
 2018年5月17日
 *
 */
public class Test5 {

	
	
	public static void main(String[] args) {
	
		int [][] m=new int [][] {{1,3,5,9},{8,1,3,4},{5,0,6,1},{8,8,4,0} };
		int dp[][]=new int [m.length+1][m[0].length+1];//dp[i][j]代表原点到这的距离
		
		for (int i = 1; i <= m.length; i++) {
			for (int j = 1; j <=m.length; j++) {
				if (dp[i][j]==0) {
					if (i==1&&j==1) {
						dp[i][j]=m[i-1][j-1];
					}
					else if(i==1&&j!=1) {
						dp[i][j]=dp[i][j-1]+m[i-1][j-1];
					}
					else if (i!=1&&j==1) {
						dp[i][j]=dp[i-1][j]+m[i-1][j-1];
					}
					else {
						dp[i][j]=Math.min(dp[i-1][j]+m[i-1][j-1], dp[i][j-1]+m[i-1][j-1]);
					}
				}	
			}
		}
System.out.println(dp[4][4]);
			
		
	}
	
}
