package com.lanqiao.practice3;

import java.util.Scanner;

/**
 * 
��������
����ÿ����Ʒ��һ����������ϻ�������ͬ����Ʒ��ϣ�װ�뱳����ս��һ���������������ÿ����Ʒ�����޼����ã���ô��Щ�������ԶҲװ�������ġ�Ϊ�˾���װ�����������е�OIER��Ҫ�о�һ����Ʒ����װ��������������Ŀ��֤�н⣬��������޽⣬��֤������2��000��000��000
������������޽⣬�����0
�����ʽ
������һ��һ������n��n<=10������ʾ��Ʒ�ļ���
������2�е�N+1��: ÿ����Ʒ�����(1<= <=500)
�����ʽ
����һ������ans����ʾ��������Щ��Ʒ�õ�����������
��������
3
3
6
10
�������
17

 * 
 * @author  Jan
 2018��5��23��
 *
 */
public class Test5 {	 
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int maxnum=100000;
		int num[]=new int [100001];
		int n=in.nextInt();
		int a[]=new int [n];
		for (int i = 0; i < a.length; i++) {
			a[i]=in.nextInt();
		}
		num[0]=1;
		for (int i = 0; i < a.length; i++) {//���������ѡ������ɵ���
			for (int j =a[i]; j <= maxnum; j++){
				if (num[j-a[i]]==1) { //i=0ʱ��jΪa[0]�ı���
					num[j]=1;
				}	
			}
			
		}
		for (int i = maxnum; i>0; i--) {
			if (num[i]!=1) {//���ھ����
				System.out.println(i);
				return ; //�������ֹ
			}
		}
		
	
            //���������޽�
			System.out.println(0);
		
	}
	

}