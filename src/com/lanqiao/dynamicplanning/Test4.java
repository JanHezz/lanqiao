package com.lanqiao.dynamicplanning;

/**
 * ��n��̨�ף�һ����ÿ����һ���������������ж���������n��̨�׵ķ���
 * @author  Jan
 2018��5��17��
 *
 */

public class Test4 {
     
	static int [] dp;
	static int F(int n)
	{
		if (n==1||n==2) {
			return n;
		}
		if (dp[n-1]==0)
		{
			dp[n-1]=F(n-1);
		}
		if (dp[n-2]==0) {
			dp[n-2]=F(n-2);
		}
		return dp[n-1]+dp[n-2];	
	}
	
	public static void main(String[] args) {
		int n=4;
		dp=new int [n+1];
		System.out.println(F(n));
	}
	
}
