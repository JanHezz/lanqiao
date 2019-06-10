package com.lanqiao.dynamicplanning;

public class Test2 {
	public static void main(String[] args) {
	
		int n=4;
		String num="3212";
		int k=3;
		int [] nums=new int [50];
		int part[][] =new int [50][50];//存储从第i位到第j位的值
		int dp[][]=new int [50][50];//存储n位数加m个乘号的最大解
		for(int i=1;i<=n;i++)
		{
			nums[i]=Integer.valueOf(num.substring(i-1, i));
		}
		for (int i = 1; i <=n; i++) {
			for (int j = i; j <=n; j++) {
				part[i][j]=part[i][j-1]*10+nums[j];
			}
		}
		/*//输出
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				System.out.print(part[i][j]+" ");
			}
			System.out.println();
		}*/
		for (int i = 1; i <=n; i++) {
			dp[i][0]=part[1][i];//存储原数
		}
		//核心
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=k; j++) {
				for (int l = j; l <=i; l++) 
				{//从已加的乘号个数算起，乘号个数不要大于等于原数的长度
			dp[i][j]=Math.max(dp[i][j], dp[l][j-1]*part[l+1][i]);
			//加乘号是否大于原数？
				}
			}
		}
		System.out.println(dp[n][k]);
		
	}

}
