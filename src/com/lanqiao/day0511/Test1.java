package com.lanqiao.day0511;

import java.util.Arrays;
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

 * 
 * @author  Jan
 2018��5��11��
 *
 */


public class Test1 {
	static int F(int [] all,int choose,boolean[] ischoose)
	{
		for(int i=0;i<all.length;i++)
		{
			if(ischoose[i]) {
			  continue ;
		       }
		  if (all[i]%choose==0||choose%all[i]==0) {//�ж��Ƿ���Լ�����߱���
			  ischoose[i]=true;
			  int res=F(all, all[i], ischoose);
			  ischoose[i]=false; 
			  if (res==1) {//����Ӯ���Ҿ�����
				return -1;
			 }
		    }	
		}
		//����ûӮ�ʹ����Լ�Ӯ��
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String sal=in.nextLine();
		String[] sAlls=sal.split("[\\s]+");
		int all[]=new int[sAlls.length];
		for (int i = 0; i < all.length; i++) {
			all[i]=Integer.valueOf(sAlls[i]);
		}
		Arrays.sort(all);
		String sCho=in.nextLine();
		String [] sChos=sCho.split("[\\s]+");
		
		int choose[]=new int[sChos.length];
		for (int i = 0; i < choose.length; i++) {
			choose[i]=Integer.valueOf(sChos[i]);
		}
		Arrays.sort(choose);
		boolean ischoose[]=new boolean[all.length];
		for (int i = 0; i < choose.length; i++) {
			for (int j = 0; j < ischoose.length; j++) {
				if (choose[i]==all[j]) {
					ischoose[j]=true;
					int res=F(all, choose[i], ischoose);
					if (res==1) {
						System.out.println(choose[i]);
						return;
					}
					ischoose[j]=false;
					break ;
				}
			} 
		}
		System.out.println(-1);
		  }

}
