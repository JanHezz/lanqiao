package com.lanqiao.javac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * Ӯ��Ʊ

ĳ�����ٰ���Ʊ��������ѡ���л���Ӯ����������Ʊ��

�������ó� N �ſ�Ƭ������д�� 1~N �����֣�������˳���ų�һ��ԲȦ��
����Դ�����һ�ſ�Ƭ��ʼ˳ʱ������: 1,2,3.....
������������ָպúͿ�Ƭ�ϵ�������ͬ����Ѹÿ�Ƭ�������У�����һ����Ƭ����������
ֱ�����޷��ջ��κο�Ƭ����Ϸ���������п�Ƭ���ֵĺ;���Ӯ����Ʊ��������

���磺
��Ƭ�����ǣ�1 2 3
���Ǵ�1�ſ���ʼ�����Ͱ�1�ſ����ߡ��ٴ�2�ſ���ʼ�������������޷��뿨Ƭ���ϣ�
�ܿ�����Խ��Խ�󣬲����������߿�Ƭ�ˡ�����������ֻӮ����1����Ʊ��

������̫����������ǿ�ʼ��ɵɵ�ش�2��3�ſ�Ƭ�����Ǿ�һ�ſ�Ƭ���ò����ˡ�

��������ã���Ƭ������ 2 1 3
�����ǿ���˳���õ����еĿ�Ƭ��

�����Ŀ����ǣ���֪˳ʱ�뿨Ƭ���С�
���������￪ʼ�����������Ӯ��������Ʊ�������������еĿ�Ƭ����֮�ͣ�

�������ݣ�
��һ��һ������N(N<100)����ʾ��Ƭ��Ŀ
�ڶ��� N ����������ʾ˳ʱ�����еĿ�Ƭ

������ݣ�
һ�У�һ����������ʾ����������Ӯ�ö�������Ʊ

���磺
�û����룺
3
1 2 3

����Ӧ�������
1

���磺
�û����룺
3
2 1 3

����Ӧ�������
6
 */

public class Test6 {
	public static int max=0;
	public static int Max(List mList)
	{
		int max=0;
		for(int i=0;i<mList.size();i++)
		{
			if ((int)mList.get(i)>max) {
				max=(int)mList.get(i);
			}
		}
		return max;
	}
	/*
	 * ��ӵ�index����ʼ���ܻ�õ����ֵ
	 * 
	 * mlist ����Դ
	 * index �ڼ�����
	 * num ������
	 * sum  ��
	 */
	public static void Dfs(List mList,int index,int num,int sum)
	{
		if (num>Max(mList)) {
			if (sum>=max) {
				max=sum;
			}
			return;
		}
		
		if (mList.size()==0) {
			if (sum>=max) {
				max=sum;
			}
			return ;
		}
		if (index>=mList.size()) {
			index=0;
		}
		if ((int)mList.get(index)==num) {
			sum+=num;
			mList.remove(index);
			Dfs(mList, index, 1, sum);
		}
		else {
			Dfs(mList, index+1, num+1, sum);
		}
	}
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	 int n=0;
	 System.out.println("����n�Ĵ�С");
	 n=in.nextInt();
	 List mList=new ArrayList();
	 for(int i=0;i<n;i++)
	 {
		mList.add(in.nextInt());
	 }
		for(int i=0;i<n;i++)
		{  List list=new ArrayList();
			list.addAll(mList);
			Dfs(list, i, 1, 0);
		}
		System.out.println(max);
	}

}
