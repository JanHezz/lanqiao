package com.lanqiao.day0511;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 
��������
������Ͼʱ������Ħ˹�ͻ�����һ����Ϸ��
������N�ſ�Ƭ��д��N��������������������һ�ſ�Ƭ��Ҫ����һ�����õ�����һ����ǰһ�����õ����ֵ�Լ�����������磬ĳ�θ���Ħ˹���ߵĿ�Ƭ��д�����֡�6��������������������õ����ְ�����
����1��2��3, 6��12��18��24 ....
�������ֵ�ĳһ���ÿ�Ƭʱ��û������Ҫ��Ŀ�Ƭ��ѡ����÷�Ϊ�䷽��
�����������ü���������Ƽ���һ�£�����֪���п�Ƭ�ϵ����ֺͿ�ѡ��Щ���ֵ������£�����ѡ����ܱ�֤��ʤ��
������ѡ������ֶ����Ա�ʤʱ�����������С�����֡����������ζ����䣬�����-1��
�����ʽ
������������Ϊ2�С���һ�������ɿո�ֿ���������ÿ����������1~100�䣩����ʾ��ǰʣ������п�Ƭ��
�����ڶ���Ҳ�����ɿո�ֿ�����������ʾ����ѡ�����֡���Ȼ���ڶ��е����ֱ�����ȫ�����ڵ�һ�е������С�
�����ʽ
���������������ʤ���з�����
��������
2 3 6
3 6
�������
3
��������
1 2 2 3 3 4 5
3 4 5
�������
4

 * ��ǿ������Ч��
 * @author  Jan
 2018��5��11��
 *
 */


public class Test1_1 {
	static int dfs(int [] num,List<Integer>[] lisa,int choose)
	{
		
		for (int i = lisa[choose].size()-1; i >=0; i--) {
			if (num[lisa[choose].get(i)]>0) {
				num[lisa[choose].get(i)]--;
				int res=dfs(num, lisa, lisa[choose].get(i));
				num[lisa[choose].get(i)]++;
				if (res==1) {
					return -1;
				}
				
			}
			
		}
		return 1;
	}
	
	public static void getResoult(String A,String B)
	{
		int num[]=new int [105];//������Χ��1����100	 
	String [] sAll=	A.split("[\\s]+");
	for (int i = 0; i < sAll.length; i++){
		int a=Integer.valueOf(sAll[i]);
		num[a]++;
	}
		List<Integer>[] LisA=new ArrayList[105]; //�����洢��Ӧ����Լ�������������м���
		for (int i = 0; i < LisA.length; i++) {
			LisA[i]=new ArrayList<Integer>();
		}
		for (int i = 1; i <=100; i++) {
			if (num[i]!=0){
				num[i]--;
				for (int j =1; j <= 100; j++) {	
					if (num[j]!=0&&(i%j==0||j%i==0)) {
						LisA[i].add(j);	
					}
					
				}
				num[i]++;
			}
		}
		String [] sChos=B.split("[\\s]+");
		int choose[]=new int[sChos.length];
		for (int i = 0; i < choose.length; i++) {
			choose[i]=Integer.valueOf(sChos[i]);
		}
		Arrays.sort(choose);
		for (int i = 0; i < choose.length; i++) {
			num[choose[i]]--;
			int res =dfs(num, LisA, choose[i]);
			num[choose[i]]++;
        if (res==1) {
			System.out.println(choose[i]);
			return;
		}			
		}
		System.out.println(-1);
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String sal=in.nextLine();
	    String cal=in.nextLine();
	    getResoult(sal, cal);
		  }

}