package com.lanqiao.practice1;

/**
 * ����ƽ����ʱ������ϣ���þ������ٵ�������ϳƳ������ܶ��������
���ֻ��5�����룬�����ֱ���1��3��9��27��81
�����ǿ�����ϳƳ�1��121֮��������������������������������������У���

����ĿҪ����ʵ�֣����û�����������������������Ϸ�����
���磺
�û����룺
5
���������
9-3-1
�û����룺
19
���������
27-9+1

Ҫ����������������Ǵ�����ǰС���ں�
���Լ����û�����������ַ��Ϸ�Χ1~121��

 * 
 * @author  Jan
 2018��5��18��
 *
 */
public class Test3 {
	
	public static void main(String[] args) {
		
		int weight[]=new int [] {1,3,9,27,81};
		int [] sign=new int [] {0,-1,1};
		int n=25;
		for (int i = 0; i < sign.length; i++) {
			for (int j = 0; j < sign.length; j++) {
				for (int j2 = 0; j2 < sign.length; j2++) {
					for (int k = 0; k < sign.length; k++) {
						for (int k2 = 0; k2 < sign.length; k2++) {
							int a=sign[i]*weight[0];
							int b=sign[j]*weight[1];
							int c=sign[j2]*weight[2];
							int d=sign[k]*weight[3];
							int e=sign[k2]*weight[4];
							if (a+b+c+d+e==n) {
								StringBuffer sb=new StringBuffer();
								sb.append(e!=0?(e>0?"+"+e:e):"");
								sb.append(d!=0?(d>0?"+"+d:d):"");
								sb.append(c!=0?(c>0?"+"+c:c):"");
								sb.append(b!=0?(b>0?"+"+b:b):"");
								sb.append(a!=0?(a>0?"+"+a:a):"");
								sb.deleteCharAt(0);
								System.out.println(sb.toString());
								return;
							}
						}
					}
				}
			}
		}
		
		
	}

}
