package com.lanqiao.Search;

/**
 *ɸ��������
 *��ȥ��2�ı�������ȥ��3�ı�������ȥ��4�ı����������������ƣ����ʣ�µľ��������� 
 * @author  Jan
 2018��5��16��
 *
 */
public class Testsieve {
      
static	int [] p=new int [10001];
	

	
	
	public static void main(String[] args) {
		
	
		for(int i=2;i<=10000;i++)
		{
	     p[i]=1;
		}
		for (int i = 2; i <=10000; i++) {
			if (p[i]==1) {
				
				for(int j=2;i*j<10000;j++)
				{
					p[i*j]=0;
				}
			}
		}
		int sum=0;
		for (int i = 2; i < 10000; i++) {
			sum+=p[i];
		}
		System.out.println(sum);
		
	}
}
	

