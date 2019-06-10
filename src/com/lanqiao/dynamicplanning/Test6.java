package com.lanqiao.dynamicplanning;

/**
 * 
 * 给定数组arr，返回arr的最长递增子序列的长度，比如arr=[2,1,5,3,6,4,8,9,7]，最长递增子序列为[1,3,4,8,9]返回其长度为5.
 * @author  Jan
 2018年5月17日
 *
 */
public class Test6 {

	public static void main(String[] args) {
		
		int [] arr=new int [] {2,1,5,3,6,4,8,9,7};
		int [] dp=new int [arr.length+1];
		
		dp[1]=1;
		for(int i=1;i<=arr.length;i++)
		{  int max=0;
			for(int j=1;j<i;j++)
			{
				if (dp[j]>max&&arr[i-1]>arr[j-1]) {
					max=dp[j];
				}
				dp[i]=max+1;
			}
		}
		
		int max=0;
		for (int i = 0; i < dp.length; i++) {
			if (max<dp[i]) {
				max=dp[i];
			}
		}
		System.out.println(max);
	
		
		
	}
}
