package com.lanqiao.practice3;

import java.util.Scanner;

/**
 * 
��������
����һ������n�Ľ׳˿���д��n!������ʾ��1��n��n�������ĳ˻����׳˵������ٶȷǳ��죬���磬13!���Ѿ��Ƚϴ��ˣ��Ѿ��޷������һ�����ͱ����У���35!�͸����ˣ����Ѿ��޷������һ�������ͱ����С���ˣ���n�Ƚϴ�ʱ��ȥ����n!�Ƿǳ����ѵġ����˵��ǣ��ڱ����У����ǵ�������ȥ����n!������ȥ����n!���ұߵ��Ǹ���0�������Ƕ��١����磬5! = 1*2*3*4*5 = 120�����5!���ұߵ��Ǹ���0��������2�����磺7! = 5040�����7!���ұߵ��Ǹ���0��������4�����дһ����������һ������n(n<=100)��Ȼ�����n! ���ұߵ��Ǹ���0�������Ƕ��١�
���������ʽ������ֻ��һ������n��
���������ʽ�����ֻ��һ����������n! ���ұߵ��Ǹ���0�����֡�
�����������
��������
6
�������
2

 * 
 * @author  Jan
 2018��5��22��
 *
 */
public class Test1 {

	public static int F(int n)
	{
		if (n==1) {
			return 1;
		}
		
		
		return n*F(n-1);
	}
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int sum=1;
		for(int i=1;i<=n;i++)
		{
			sum*=i;
			while(true)
			{
				if (sum%10==0) {
				sum/=10;
			}
			else {
				sum%=1000;
				break;
			}
			}
			
			
			
		}
	
	

	if (sum%10==0) {
			sum/=10;
		}
		else {
			System.out.println(sum%10);
	
		}
	
	}
}