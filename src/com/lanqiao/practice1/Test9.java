package com.lanqiao.practice1;

import java.util.Scanner;

/**
 * �ֽ�������
 * @author  Jan
 2018��5��21��
 *
 *˼·
 *
 *���Ȱ�ҪС����Ҫ�ֽ�������������ɸѡ����
 *���ж��ܷ�����
 *һֱ������Ϊ1Ϊֹ
 */
public class Test9 {
	static int [] num=new int [100001];
	
	static void init()
	{
		for (int i = 2; i < num.length; i++) {
			num[i]=1;
		}
		
		for (int i = 2; i < num.length; i++) {
			for (int j = 2; i*j<=10000; j++) {
				num[i*j]=0;				
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		init();
		int min=in.nextInt();
		int max=in.nextInt();
		for (int j = min; j <=max; j++) {
			if (num[j]==1) {
				System.out.println(j+"="+j);
			}
			else {
				int i=j;
				String sum=i+"=";
				while(i>1)
				{
					if (i%2==0) {
						i/=2;
						sum+=2+"*";	
					}
					if (i%3==0) {
						i/=3;
						sum+=3+"*";	
					}
					if (i%5==0) {
						i/=5;
						sum+=5+"*";	
					}
					if (i%7==0) {
						i/=7;
						sum+=7+"*";	
					}

				}
				System.out.println(sum.subSequence(0, sum.length()-1));
				
			}
		}
		
	}
	

}
