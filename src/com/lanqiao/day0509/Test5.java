package com.lanqiao.day0509;

public class Test5 {
	
	/**
	 * ����ʽ��˼����ʽ
��������û���ṩѭ���ṹ

�󴮵ĳ���
ɾ������ǰ n ���ַ�
���ķ�ת
�����Ƿ�Ϊ����
�Ƚ��������Ĵ�С

	 * @param args
	 * 
	 *@return void
	 */
	//��ô��ĳ���
	public static int getLength(String a)
	{
		if (a.equals("")) {
			return 0;
		}
		else
		{
			return getLength(a.substring(1))+1;
		}

	}
	//ɾ������ǰn���ַ�
	public static String deleteNString(int n,String a)
	{
		if (n==0) {
			return a;
		}
		return deleteNString(n-1,a.substring(1));
	}
	
	//���ķ�ת
	public static String reversal(String a)
	{
		if (a.length()==0) {
		return "";
	}	
		return reversal(a.substring(1))+a.charAt(0);
	}
	//�����Ƿ�Ϊ����
	
	public static boolean isMirror(String a)
	{   
		
		if (a.length()==1) {
			return true;
		}
		if (a.charAt(0)!=a.charAt(a.length()-1)) {
			return false;
		}
	
	return isMirror(a.substring(1,a.length()-1));
		
	}
	//�Ƚ��������Ĵ�С
	static int p(String x, String y){
		if(x.length()==0 && y.length()==0) return 0;		
		if(x.length()==0) return -1;
		if(y.length()==0) return 1;
		
		char head_x = x.charAt(0);
		char head_y = y.charAt(0);
		if(head_x != head_y) return head_x - head_y;
		
		String x1 = x.substring(1);
		String y1 = y.substring(1);
		
		return p(x1,y1);
	}
	
	public static void main(String[] args) {
	
		System.out.println(getLength("abcd"));
		System.out.println(deleteNString(2, "abc"));
		System.out.println(reversal("abc"));
		System.out.println(isMirror("aba"));
		System.out.println(p("acf", "acd"));
	}

}
