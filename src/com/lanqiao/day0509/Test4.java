package com.lanqiao.day0509;

public class Test4 {
	
	/*
	 * 今盒里有n个小球，A、B两人轮流从盒中取球。
每个人都可以看到另一个人取了多少个，也可以看到盒中还剩下多少个。
两人都很聪明，不会做出错误的判断。

每个人从盒子中取出的球的数目必须是：1，3，7或者8个。
轮到某一方取球时不能弃权！
A先取球，然后双方交替取球，直到取完。

被迫拿到最后一个球的一方为负方（输方）
    
编程确定出在双方都不判断失误的情况下，对于特定的初始球数，A是否能赢？
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
			//如果为0就代表赢了
			return true;
		}
	return ((n>=8&&!F(n-8))||(n>=7&&!F(n-7)||(n>=3&&!F(n-3))||!F(n-1)));
	//函数面前带！代表别人输你就赢别人赢你就是输
	}
	public static void main(String[] args) {
		
		int n=10;
		System.out.println(f(10));
		
	}

}
