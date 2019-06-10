package com.lanqiao.practice2;

public class test2 {
	
	static int fcd(int m,int n)
	{
		return m*n/Gcd(m, n);
	}
	
	static int Gcd(int m,int n)
	{
		if (n==0) {
      return m;
		}
		
		return Gcd(n, m%n);
	}

	public static void main(String[] args) {
		
	int x=fcd(11, 17);
		
		for (int i = x; i <=1000; i+=x) {
			System.out.println(i);
		}
	}
}
