package com.lanqiao.day0509;

import java.util.Scanner;

/**
 * 
 * K大师在纸上画了一行n个格子，要小明和他交替往其中填入字母。

1. 轮到某人填的时候，只能在某个空格中填入 L 或 O
2. 谁先让字母组成了“LOL”的字样，谁获胜。
3. 如果所有格子都填满了，仍无法组成LOL，则平局。

小明试验了几次都输了，他很惭愧，希望你能用计算机帮他解开这个谜。

本题的输入格式为：
第一行，数字n（n<10），表示下面有n个初始局面。
接下来，n行，每行一个串，表示开始的局面。
  比如：“******”, 表示有6个空格。“L****”,   表示左边是一个字母L，它的右边是4个空格。

要求输出n个数字，表示对每个局面，如果小明先填，当K大师总是用最强着法的时候，小明的最好结果。
1 表示能赢
-1 表示必输
0 表示可以逼平

例如，
输入：
4
***
L**L
L**L***L
L*****L

则程序应该输出：
0
-1
1
1
 * @author  Jan
 2018年5月10日
 *
 */
public class Test2 {
	
	
	public static int is_Lol(String x)
	{
	
		if (x.contains("LOL")) return -1;
		if (!x.contains("*")) return 0;
		int ping=0;
		for(int i=0;i<x.length()-1;i++)
		{
			if (x.substring(i, i+1).equals("*")) {//有空格就模拟
				//有空格用L替代
				StringBuffer sB=new StringBuffer(x);
				sB.replace(i, i+1, "L");			
				switch (is_Lol(sB.toString())) {
				case -1: return 1;	  //对方输那就代表自己赢  如果能赢就直接return；
				case 1:ping=-1;  //对方赢就自己输
				}
				//用O替代
				sB.replace(i, i+1, "O");
				switch (is_Lol(sB.toString())) {
				case -1:return 1;
				case 1:ping=-1;break;
				}	
			}	
		}
		if (ping==0) {
			return 0;
		}
		return -1;
	
	}
 public static void main(String[] args) {
	 Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	String [] xStrings=new String[n];
	for (int i = 0; i < n; i++) {
		in=new Scanner(System.in);
		String xString=in.nextLine();
	    xStrings[i]=xString;
	}
	for (String string : xStrings) {
		System.out.println(is_Lol(string));
	}

}

}
