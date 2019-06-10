package com.lanqiao.practice3;

import java.util.Scanner;

/**
 * 问题描述 
　　设有N*N的方格图(N<=10),我们将其中的某些方格中填入正整数,而其他的方格中则放入数字0。
　　某人从图的左上角的A 点(1,1)出发，可以向下行走，也可以向右走，直到到达右下角的B点(N,N)。在走过的路上，他可以取走方格中的数（取走后的方格中将变为数字0）。
　　此人从A点到B 点共走两次，试找出2条这样的路径，使得取得的数之和为最大。
输入格式
　　输入的第一行为一个整数N（表示N*N的方格图），接下来的每行有三个整数，前两个表示位置，第三个数为该位置上所放的数。一行单独的0表示输入结束。
输出格式
　　只需输出一个整数，表示2条路径上取得的最大的和。
样例输入
　　8
　　2 3 13
　　2 6 6
　　3 5 7
　　4 4 14
　　5 2 21
　　5 6 4
　　6 3 15
　　7 2 14
　　0 0 0
样例输出
　　67
 * 
 * @author  Jan
 2018年5月23日
 *
 *转移方程如下：

dp[x1][y1][x2][y2] = max( dp[x1 - 1][y1][x2 - 1][y2], dp[x1 - 1][y1][x2][y2 - 1], dp[x1][y1 - 1][x2][y2 - 1], dp[x1][y1 - 1][x2 - 1][y2] )

dp[x1][y1][x2][y2]代表的含义是第一个人和第二个人同时走，第一个人走到（x1, y1），第二个人走到（x2, y2）时候的最大值。

dp[x1 - 1][y1][x2 - 1][y2]：这两个人都是从左边走过来的

dp[x1][y1 - 1][x2][y2 - 1]：这两个人都是从上边走过来的

dp[x1 - 1][y1][x2][y2 - 1]：第一人从左边走过来，第二个人从上边走过来

dp[x1][y1 - 1][x2 - 1][y2]：第一人从上边走过来，第二个人从左边走过来

然后需要注意的是，如果x1 == x2 && y1 == y2，此时两个人是走到同一个点了，但是这个点的权值只能加一次，因为要模拟走过一次，这个点就要变成0的情况。
 */
public class Test6 {
	
   public static void main(String[] args) {
	   Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int grid[][]=new int [n+1][n+1];
    int dp[][][][]=new int [n+1][n+1][n+1][n+1];
    while(true)
    {
    	int x=in.nextInt();
    	int y=in.nextInt();
    	int num=in.nextInt();
    	if (x==0&&y==0&&num==0) {
			break ;
		}
    	grid[x][y]=num;
    }
    dp[1][1][1][1] = grid[1][1];  
    for (int i = 1; i <dp.length; i++) {
		for (int j = 1; j < dp.length; j++) {
			for (int j2 = 1; j2 <dp.length; j2++) {
				for (int k = 1; k <dp.length; k++) {
					if ((i+j)!=(j2+k)) {
						continue;
					}
	
						int temp;
						temp=Math.max(dp[i-1][j][j2-1][k], dp[i][j-1][j2][k-1]);
						temp=Math.max(temp, dp[i-1][j][j2][k-1]);
						temp=Math.max(temp, dp[i][j-1][j2-1][k]);
					if (i==j2&&j==k) {
						dp[i][j][j2][k]=temp+grid[i][j];
					}
					else {
						dp[i][j][j2][k]=temp+grid[i][j]+grid[j2][k];
					}
					
				}
			}
		}
	}
    
    System.out.println(dp[n][n][n][n]);
}
}
