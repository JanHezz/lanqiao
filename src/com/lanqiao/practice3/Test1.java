package com.lanqiao.practice3;

import java.util.Scanner;

/**
 * 
问题描述
　　一个整数n的阶乘可以写成n!，它表示从1到n这n个整数的乘积。阶乘的增长速度非常快，例如，13!就已经比较大了，已经无法存放在一个整型变量中；而35!就更大了，它已经无法存放在一个浮点型变量中。因此，当n比较大时，去计算n!是非常困难的。幸运的是，在本题中，我们的任务不是去计算n!，而是去计算n!最右边的那个非0的数字是多少。例如，5! = 1*2*3*4*5 = 120，因此5!最右边的那个非0的数字是2。再如：7! = 5040，因此7!最右边的那个非0的数字是4。请编写一个程序，输入一个整数n(n<=100)，然后输出n! 最右边的那个非0的数字是多少。
　　输入格式：输入只有一个整数n。
　　输出格式：输出只有一个整数，即n! 最右边的那个非0的数字。
输入输出样例
样例输入
6
样例输出
2

 * 
 * @author  Jan
 2018年5月22日
 *
 */
public class Test1 {

	public static int F(int n)
	{
		if (n==1) {
			return 1;
		}
		
		
		return n*F(n-1);
	}
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int sum=1;
		for(int i=1;i<=n;i++)
		{
			sum*=i;
			while(true)
			{
				if (sum%10==0) {
				sum/=10;
			}
			else {
				sum%=1000;
				break;
			}
			}
			
			
			
		}
	
	

	if (sum%10==0) {
			sum/=10;
		}
		else {
			System.out.println(sum%10);
	
		}
	
	}
}
