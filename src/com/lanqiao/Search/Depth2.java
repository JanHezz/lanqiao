package com.lanqiao.Search;

import java.util.concurrent.CountDownLatch;

/**
 * ��� ѡ������������NOIP2002pj��
[��������]:��֪ n ������ x1,x2,��,xn���Լ�һ������ k(k��n)����n ����������ѡ k ��������ӣ��ɷֱ�õ�һϵ�еĺ͡����統 n=4��k��3��4 �������ֱ�Ϊ 3��7��12��19 ʱ���ɵ�ȫ������������ǵĺ�Ϊ��3��7��12=22����3��7��19��29����7��12��19��38����3��12��19��34�����ڣ�Ҫ����������Ϊ�������ж����֡�����������ֻ��һ�ֵĺ�Ϊ������3��7��19��29�� 

 * 
 * @author  Jan
 2018��5��16��
 *
 */
public class Depth2 {
	static int count=0;
	static int [] p;
	static void init(int n)
	{
		p=new int [n+1];
		for(int i=2;i<=n;i++)
		{
			p[i]=1;
		}
		for(int i=2;i<=n;i++)//ɸ������ȥ��2 3 4 ...�ı���ʣ�µľ�������
		{
			if (p[i]==1) {
				
				for(int j=2;i*j<=n;j++)
				{
					p[i*j]=0;
				}	
			}
		}
		
		
	}
	
	
	
	static void dfs(int [] a,int j,int sum,int cou,int k)
	{
		
		if (cou>=k) {
			if (p[sum]==1) {
				count++;
			}
			return ;
		}
		for(int i=j;i<a.length;i++)
		{
			sum+=a[i];
	        dfs(a, i+1, sum,cou+1,k);
	        sum-=a[i];
		}
	
		
	}
	public static void main(String[] args) {
		int [] a=new int [] {3,7,12,19};
		int k=3;
		init(10000);
		for (int i = 0; i <a.length-k+1; i++) {
			dfs(a, i+1, a[i],1,k);
		}
		System.out.println(count);
	}

}
