package com.lanqiao.dynamicplanning;

public class Test2 {
	public static void main(String[] args) {
	
		int n=4;
		String num="3212";
		int k=3;
		int [] nums=new int [50];
		int part[][] =new int [50][50];//�洢�ӵ�iλ����jλ��ֵ
		int dp[][]=new int [50][50];//�洢nλ����m���˺ŵ�����
		for(int i=1;i<=n;i++)
		{
			nums[i]=Integer.valueOf(num.substring(i-1, i));
		}
		for (int i = 1; i <=n; i++) {
			for (int j = i; j <=n; j++) {
				part[i][j]=part[i][j-1]*10+nums[j];
			}
		}
		/*//���
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				System.out.print(part[i][j]+" ");
			}
			System.out.println();
		}*/
		for (int i = 1; i <=n; i++) {
			dp[i][0]=part[1][i];//�洢ԭ��
		}
		//����
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=k; j++) {
				for (int l = j; l <=i; l++) 
				{//���Ѽӵĳ˺Ÿ������𣬳˺Ÿ�����Ҫ���ڵ���ԭ���ĳ���
			dp[i][j]=Math.max(dp[i][j], dp[l][j-1]*part[l+1][i]);
			//�ӳ˺��Ƿ����ԭ����
				}
			}
		}
		System.out.println(dp[n][k]);
		
	}

}
