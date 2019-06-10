package com.lanqiao.practice3;

/**
 * 快速幂
 * @author  Jan
 2018年5月22日
 *
 */
public class Test2 {
     //快速幂取模
	static int F(int a,int b)
	{
		int sum=1;
		while(b>0)
		{
			if (b%2==1) {
				sum=(sum*a)%100;
			}
			
			a=a*a%100;
			b=b/2;
		}
		
	return sum;	
	}
	public static void main(String[] args) {
		System.out.println(F(4, 5));
		
	}
	
}
