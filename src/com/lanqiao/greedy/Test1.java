package com.lanqiao.greedy;

import java.util.Scanner;

/**
 * 
 * ̰�ķ�Ӧ��
��1 ����ֽ�ƣ�NOIP2002tg��
[��������]���� N ��ֽ�ƣ���ŷֱ�Ϊ 1��2����, N��ÿ�����������ţ���ֽ��������Ϊ N �ı�������������һ����ȡ������ֽ�ƣ�Ȼ���ƶ������ƹ���Ϊ���ڱ��Ϊ 1 ����ȡ��ֽ�ƣ�ֻ���Ƶ����Ϊ 2 �Ķ��ϣ��ڱ��Ϊ N �Ķ���ȡ��ֽ�ƣ�ֻ���Ƶ����Ϊ N-1 �Ķ��ϣ���������ȡ��ֽ�ƣ������Ƶ�������߻��ұߵĶ��ϡ�����Ҫ���ҳ�һ���ƶ������������ٵ��ƶ�����ʹÿ����ֽ������һ���ࡣ���� N=4��4 ��ֽ�����ֱ�Ϊ��
�����١�9���ڡ�8���ۡ�17���ܡ�6
�ƶ�3�οɴﵽĿ�ģ�
������ �� ȡ 4 ���Ʒŵ� �� ��9 8 13 10�� -> �� �� ȡ 3 ���Ʒŵ� �ڣ�9 11 10 10��-> �� �� ȡ 1 ���Ʒŵ��٣�10 10 10 10����
[�� ��]�����������ļ�����
�ļ���ʽ��N��N ��ֽ�ƣ�1 <= N <= 100��
����A1 A2 �� An ��N ��ֽ�ƣ�ÿ��ֽ�Ƴ�ʼ����l<= Ai <=10000��
[�� ��]���������Ļ����ʽΪ�����жѾ��ﵽ���ʱ�������ƶ�������
[�����������]
a.in��
��4
��9 8 17 6
��Ľ��ʾ��3

 * 
 * @author  Jan
 2018��5��13��
 *
 */
public class Test1 {
	
	public static void main(String[] args) {
		
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int [] a=new int[n];
		int sum=0;
		int avg;
		for (int i = 0; i < a.length; i++) {
			a[i]=in.nextInt();
			sum+=a[i];
		}
		avg=sum/n;
		int count=0;
		for (int i = 0; i < a.length-1; i++) {
			if (a[i]<avg) {
				int v=avg-a[i];
				a[i]=avg;
				a[i+1]-=v;
			    count++;	
			}
			else if (a[i]>avg) {
				int v=a[i]-avg;
				a[i]=avg;
				a[i+1]+=v;
				count++;
			}
			
		}
		System.out.println(count);
		
	}
	
	

}
