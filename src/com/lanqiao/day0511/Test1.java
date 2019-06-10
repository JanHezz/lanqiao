package com.lanqiao.day0511;

import java.util.Arrays;
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

 * 
 * @author  Jan
 2018年5月11日
 *
 */


public class Test1 {
	static int F(int [] all,int choose,boolean[] ischoose)
	{
		for(int i=0;i<all.length;i++)
		{
			if(ischoose[i]) {
			  continue ;
		       }
		  if (all[i]%choose==0||choose%all[i]==0) {//判断是否是约数或者倍数
			  ischoose[i]=true;
			  int res=F(all, all[i], ischoose);
			  ischoose[i]=false; 
			  if (res==1) {//别人赢了我就输了
				return -1;
			 }
		    }	
		}
		//别人没赢就代表自己赢了
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String sal=in.nextLine();
		String[] sAlls=sal.split("[\\s]+");
		int all[]=new int[sAlls.length];
		for (int i = 0; i < all.length; i++) {
			all[i]=Integer.valueOf(sAlls[i]);
		}
		Arrays.sort(all);
		String sCho=in.nextLine();
		String [] sChos=sCho.split("[\\s]+");
		
		int choose[]=new int[sChos.length];
		for (int i = 0; i < choose.length; i++) {
			choose[i]=Integer.valueOf(sChos[i]);
		}
		Arrays.sort(choose);
		boolean ischoose[]=new boolean[all.length];
		for (int i = 0; i < choose.length; i++) {
			for (int j = 0; j < ischoose.length; j++) {
				if (choose[i]==all[j]) {
					ischoose[j]=true;
					int res=F(all, choose[i], ischoose);
					if (res==1) {
						System.out.println(choose[i]);
						return;
					}
					ischoose[j]=false;
					break ;
				}
			} 
		}
		System.out.println(-1);
		  }

}
