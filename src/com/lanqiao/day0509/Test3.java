package com.lanqiao.day0509;

public class Test3 {
	/**
	 * ��3��Ӳ�ң��ֱ���3,4,5
      ��������ȡӲ�ҡ�
ÿ��ÿ��ֻ�ܴ�ĳһ����ȡ����������
������Ȩ��
ȡ�����һöӲ�ҵ�ΪӮ�ҡ�

����ȡӲ��һ�����ޱ�ʤ���з���
	*/
	//���ҪӮ��Ҫ��֤�Լ�ȡ�����ż����
	//��֤��ż���ѵ�ͬʱҪ��֤�ö�Ϊż��
/*
	public static boolean F(int [] a,int i,int j,int max)
	{
		
		if (j==1) {
			return true;
		}
		if (j%2!=0) {
			
		}
		
	}
	*/
	public static void F(int [] a)
	{
		
		int sum=0;
	//������������ʣ�0����κ���������=�κ�����1����κ���������=�Ѹ���ȡ���� 
		for(int i=0;i<a.length;i++)
		{
			sum^=a[i];
		}
		if (sum==0) {//�������0���ֱ���   ����
			System.out.println("losre");
			return ;
		}
		for(int i=0;i<a.length;i++)//
		{
			/*for(int j=1;j<=a[i];j++)
			{
				int x=a[i]-j;
				for(int k=0;k<a.length;k++)
				{
					if (k==i) {
						continue;
					}
					x^=a[k];
				}
				if (x==0) {
					System.out.println(a[i]+"--->"+j);
				}
				
			}*/
			int x=sum^a[i];//sum�Զѽ����������ó��Ľ�����Ǹö�ʣ�µ���
			if (x<a[i]) {//xҪС�ڶѵ�����
				//1. ����ȡ
				//2.�������
				System.out.println("win"+a[i]+"---->"+x);
			}
			
		}
		
		
	}
	public static void main(String[] args) {
		int []a=new int [] {3,4,5};
		F(a);
	}

}
