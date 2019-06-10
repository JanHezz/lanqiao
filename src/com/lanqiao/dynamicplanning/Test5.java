package com.lanqiao.dynamicplanning;

/**
 * ����һ������m�������Ͻǿ�ʼÿ��ֻ�������߻��������ߣ����ﵽ���½ǵ�λ�ã�·�������������ۼ���������·���ͣ���������·������С·���ͣ����������m���£���ô·��1,3,1,0,6,1,0������С·���ͣ�����12.

1 3 5 9

8 1 3 4

5 0 6 1

8 8 4 0
 * 
 * 
 * @author  Jan
 2018��5��17��
 *
 */
public class Test5 {

	
	
	public static void main(String[] args) {
	
		int [][] m=new int [][] {{1,3,5,9},{8,1,3,4},{5,0,6,1},{8,8,4,0} };
		int dp[][]=new int [m.length+1][m[0].length+1];//dp[i][j]����ԭ�㵽��ľ���
		
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
