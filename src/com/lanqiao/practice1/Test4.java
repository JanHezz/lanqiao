package com.lanqiao.practice1;


/**
 * 不定方程
 * 97x+127y=1求解
 * @author  Jan
 2018年5月18日
 *
 */
public class Test4 {
	
	static int gcd(int a,int b)
	{
		if (b==0) {
			return a;
		}
	return	gcd(b, a%b);
		
	}
	public static void main(String[] args) {
		
		
		// 97*x+127*y=1
		// 97 x=1-127*y;
		
		// x=(1-127*y)/97
		
		
		System.out.println(gcd(127, 97%127));
		
	int i=0;
		while(true)
		{
			i--;
			if ((1-127*i)%97==0) {
				System.out.println("Y"+i);
				int x=((1-127*i)/97);
				System.out.println("x"+x);
				return ;
			}
			
			
		}
		
	}

}
