package com.lanqiao.practice2;

import java.util.Scanner;

/**
 * ��������
������һ����������ΪV����������0����V����20000����ͬʱ��n����Ʒ��0��n����30����ÿ����Ʒ��һ�����������������
����Ҫ��n����Ʒ�У���ȡ���ɸ�װ�����ڣ�ʹ���ӵ�ʣ��ռ�Ϊ��С��
�����ʽ
������һ��Ϊһ����������ʾ����������
�����ڶ���Ϊһ����������ʾ��n����Ʒ��
����������n�У�ÿ��һ��������ʾ��n����Ʒ�ĸ��������
 * 
 * @author  Jan
 2018��5��22��
 *
 */
public class Test10 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int v=in.nextInt();
		int n=in.nextInt();
		int [][]dp=new int[n+1][v+1];//���� n�� װ�����Ϊv �����ֵ
		for (int i = 1; i <=n; i++) {
			int t=in.nextInt();			
			for (int j = 1; j <=v; j++) {
				
				if (j>=t) {
					dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-t]+t);
				}
				else {
					dp[i][j]=dp[i-1][j];
				}
				
			}
			
		}
		System.out.println(v-dp[n][v]);
		
	}

}
