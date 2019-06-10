package com.lanqiao.day0509;

public class Test5 {
	
	/**
	 * 函数式的思考方式
假设语言没有提供循环结构

求串的长度
删除串的前 n 个字符
串的翻转
测试是否为镜像串
比较两个串的大小

	 * @param args
	 * 
	 *@return void
	 */
	//获得串的长度
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
	//删除串的前n个字符
	public static String deleteNString(int n,String a)
	{
		if (n==0) {
			return a;
		}
		return deleteNString(n-1,a.substring(1));
	}
	
	//串的翻转
	public static String reversal(String a)
	{
		if (a.length()==0) {
		return "";
	}	
		return reversal(a.substring(1))+a.charAt(0);
	}
	//测试是否为镜像串
	
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
	//比较两个串的大小
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
