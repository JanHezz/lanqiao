package com.lanqiao.greedy;

import java.util.Scanner;

/**
 * 
 * 贪心法应用
例1 均分纸牌（NOIP2002tg）
[问题描述]　有 N 堆纸牌，编号分别为 1，2，…, N。每堆上有若干张，但纸牌总数必为 N 的倍数。可以在任一堆上取若干张纸牌，然后移动。移牌规则为：在编号为 1 堆上取的纸牌，只能移到编号为 2 的堆上；在编号为 N 的堆上取的纸牌，只能移到编号为 N-1 的堆上；其他堆上取的纸牌，可以移到相邻左边或右边的堆上。现在要求找出一种移动方法，用最少的移动次数使每堆上纸牌数都一样多。例如 N=4，4 堆纸牌数分别为：
　　①　9　②　8　③　17　④　6
移动3次可达到目的：
　　从 ③ 取 4 张牌放到 ④ （9 8 13 10） -> 从 ③ 取 3 张牌放到 ②（9 11 10 10）-> 从 ② 取 1 张牌放到①（10 10 10 10）。
[输 入]：键盘输入文件名。
文件格式：N（N 堆纸牌，1 <= N <= 100）
　　A1 A2 … An （N 堆纸牌，每堆纸牌初始数，l<= Ai <=10000）
[输 出]：输出至屏幕。格式为：所有堆均达到相等时的最少移动次数。
[输入输出样例]
a.in：
　4
　9 8 17 6
屏慕显示：3

 * 
 * @author  Jan
 2018年5月13日
 *
 */
public class Test1 {
	
	public static void main(String[] args) {
		
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int [] a=new int[n];
		int sum=0;
		int avg;
		for (int i = 0; i < a.length; i++) {
			a[i]=in.nextInt();
			sum+=a[i];
		}
		avg=sum/n;
		int count=0;
		for (int i = 0; i < a.length-1; i++) {
			if (a[i]<avg) {
				int v=avg-a[i];
				a[i]=avg;
				a[i+1]-=v;
			    count++;	
			}
			else if (a[i]>avg) {
				int v=a[i]-avg;
				a[i]=avg;
				a[i+1]+=v;
				count++;
			}
			
		}
		System.out.println(count);
		
	}
	
	

}
