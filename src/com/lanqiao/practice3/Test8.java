package com.lanqiao.practice3;

public class Test8 {
	
	static int maxLengh(String a,String b)
	{
		if (a.length()==0||b.length()==0) {
			return 0;
		}
		if (a.charAt(0)==b.charAt(0)) {
			return maxLengh(a.substring(1), b.substring(1))+1;
		}
		else
		{
			return Math.max(maxLengh(a.substring(1), b), maxLengh(a, b.substring(1)));
		}
		
	}
	public static void main(String[] args) {
		
		String a="abcd";
		String b="acde";
		System.out.println(maxLengh(a, b));
	}

}
