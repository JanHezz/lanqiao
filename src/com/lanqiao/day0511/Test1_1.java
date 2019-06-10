package com.lanqiao.day0511;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 
问题描述
　　闲暇时，福尔摩斯和华生玩一个游戏：
　　在N张卡片上写有N个整数。两人轮流拿走一张卡片。要求下一个人拿的数字一定是前一个人拿的数字的约数或倍数。例如，某次福尔摩斯拿走的卡片上写着数字“6”，则接下来华生可以拿的数字包括：
　　1，2，3, 6，12，18，24 ....
　　当轮到某一方拿卡片时，没有满足要求的卡片可选，则该方为输方。
　　请你利用计算机的优势计算一下，在已知所有卡片上的数字和可选哪些数字的条件下，怎样选择才能保证必胜！
　　当选多个数字都可以必胜时，输出其中最小的数字。如果无论如何都会输，则输出-1。
输入格式
　　输入数据为2行。第一行是若干空格分开的整数（每个整数介于1~100间），表示当前剩余的所有卡片。
　　第二行也是若干空格分开的整数，表示可以选的数字。当然，第二行的数字必须完全包含在第一行的数字中。
输出格式
　　程序则输出必胜的招法！！
样例输入
2 3 6
3 6
样例输出
3
样例输入
1 2 2 3 3 4 5
3 4 5
样例输出
4

 * 加强了运算效率
 * @author  Jan
 2018年5月11日
 *
 */


public class Test1_1 {
	static int dfs(int [] num,List<Integer>[] lisa,int choose)
	{
		
		for (int i = lisa[choose].size()-1; i >=0; i--) {
			if (num[lisa[choose].get(i)]>0) {
				num[lisa[choose].get(i)]--;
				int res=dfs(num, lisa, lisa[choose].get(i));
				num[lisa[choose].get(i)]++;
				if (res==1) {
					return -1;
				}
				
			}
			
		}
		return 1;
	}
	
	public static void getResoult(String A,String B)
	{
		int num[]=new int [105];//整数范围在1——100	 
	String [] sAll=	A.split("[\\s]+");
	for (int i = 0; i < sAll.length; i++){
		int a=Integer.valueOf(sAll[i]);
		num[a]++;
	}
		List<Integer>[] LisA=new ArrayList[105]; //用来存储对应数的约数跟倍数的数有几个
		for (int i = 0; i < LisA.length; i++) {
			LisA[i]=new ArrayList<Integer>();
		}
		for (int i = 1; i <=100; i++) {
			if (num[i]!=0){
				num[i]--;
				for (int j =1; j <= 100; j++) {	
					if (num[j]!=0&&(i%j==0||j%i==0)) {
						LisA[i].add(j);	
					}
					
				}
				num[i]++;
			}
		}
		String [] sChos=B.split("[\\s]+");
		int choose[]=new int[sChos.length];
		for (int i = 0; i < choose.length; i++) {
			choose[i]=Integer.valueOf(sChos[i]);
		}
		Arrays.sort(choose);
		for (int i = 0; i < choose.length; i++) {
			num[choose[i]]--;
			int res =dfs(num, LisA, choose[i]);
			num[choose[i]]++;
        if (res==1) {
			System.out.println(choose[i]);
			return;
		}			
		}
		System.out.println(-1);
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String sal=in.nextLine();
	    String cal=in.nextLine();
	    getResoult(sal, cal);
		  }

}
