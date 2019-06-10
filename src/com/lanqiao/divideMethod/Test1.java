package com.lanqiao.divideMethod;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ��������
����������2 n��n<=6������ӽ��е�ѭ���������ƻ���2 n �C 1������ɣ�ÿ����ÿ�����һ�����������һ�������İ��ţ�ʹ��2 n �C 1����ÿ���Ӷ��벻ͬ�Ķ��ֱ�����
�����ʽ
���������ļ�matchplan.in��һ�У�����n����ֵ��
�����ʽ
��������ļ�matchplan.out����2 n �C 1���У���i�������i��ı������š�
������ʽΪ��<i> A-B��C-D������������i��������A��B�ֱ�Ϊ����˫���ı�ţ�ÿ�й�2 n-1���������Ρ�
 * @author  Jan
 2018��5��22��
 *
 */
public class Test1 {
	
	//���η�
	static  void table(int [][] table,int n)
	{
		if (n==1) {
			table[0][0]=1;
			return ;
		}
		int m=n/2;
		table(table, m);
		
		//�������
		for (int i = 0; i < m; i++) {
			for (int j = m; j < n; j++) {
			table[i][j] = table[i][j - m] + m;//���ϵ������ϼ�m
			}
	 }
		//�������            ���µ�������
		for (int i = m; i <n; i++) {
			for (int j = 0; j <m; j++) {
			
				table[i][j]=table[i-m][j]+m;//���µ������ϼ�m
				
			}
			
		}
		
		// ��������
		for (int i = m; i < n; i++) {
		for (int j = m; j < n; j++) {
		table[i][j] = table[i - m][j - m];//���µ�������
		}
		}

	}
	
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=(int)Math.pow(2, n);
		int [][] table=new int [m][m];
		table(table, m);
		
		for (int day = 1; day <m; day++) {
			System.out.print("<"+day+">");
			ArrayList<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i <m;i++) {
			
		if (list.contains(table[i][0])||list.contains(table[i][day])) {
			continue;
		}
                System.out.print(table[i][0]+"-");
				System.out.print(table[i][day]+" ");
				list.add(table[i][0]);
				list.add(table[i][day]);
		}
		System.out.println();
		}
	
			
			
			}		
	}


