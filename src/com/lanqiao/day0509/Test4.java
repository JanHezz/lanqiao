package com.lanqiao.day0509;

public class Test4 {
	
	/*
	 * �������n��С��A��B���������Ӻ���ȡ��
ÿ���˶����Կ�����һ����ȡ�˶��ٸ���Ҳ���Կ������л�ʣ�¶��ٸ���
���˶��ܴ�������������������жϡ�

ÿ���˴Ӻ�����ȡ���������Ŀ�����ǣ�1��3��7����8����
�ֵ�ĳһ��ȡ��ʱ������Ȩ��
A��ȡ��Ȼ��˫������ȡ��ֱ��ȡ�ꡣ

�����õ����һ�����һ��Ϊ�������䷽��
    
���ȷ������˫�������ж�ʧ�������£������ض��ĳ�ʼ������A�Ƿ���Ӯ��
	 */
	 
	static boolean f(int n){
		if(n==0) return true;	
		if(n>=1 && f(n-1)==false) return true;
		if(n>=3 && f(n-3)==false) return true;
		if(n>=7 && f(n-7)==false) return true;
		if(n>=8 && f(n-8)==false) return true;
		
		return false;
	}
	public static boolean F(int n)
	{
		if (n==0) {
			//���Ϊ0�ʹ���Ӯ��
			return true;
		}
	return ((n>=8&&!F(n-8))||(n>=7&&!F(n-7)||(n>=3&&!F(n-3))||!F(n-1)));
	//������ǰ����������������Ӯ����Ӯ�������
	}
	public static void main(String[] args) {
		
		int n=10;
		System.out.println(f(10));
		
	}

}
