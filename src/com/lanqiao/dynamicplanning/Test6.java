package com.lanqiao.dynamicplanning;

/**
 * 
 * ��������arr������arr������������еĳ��ȣ�����arr=[2,1,5,3,6,4,8,9,7]�������������Ϊ[1,3,4,8,9]�����䳤��Ϊ5.
 * @author  Jan
 2018��5��17��
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
