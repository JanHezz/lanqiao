package com.lanqiao.practice2;

import java.util.Scanner;

/**
 * 
问题描述
　　涛涛立志要做新好青年，他最近在学做菜。由于技术还很生疏，他只会用鸡蛋，西红柿，鸡丁，辣酱这四种原料来做菜，我们给这四种原料标上字母A,B,C,D。
　　涛涛现在会做的菜有五种：
　　1、 西红柿炒鸡蛋 原料：AABDD
　　2、 酸辣鸡丁 原料：ABCD
　　3、 宫保鸡丁 原料：CCD
　　4、 水煮西红柿 原料：BBB
　　5、 怪味蛋 原料：AD
　　这天早上，开开去早市给涛涛买了一些原料回来。由于事先没有什么计划，涛涛决定，对于现存的原料，每次尽量做菜单上靠前（即编号小）的菜。
　　现在请你写一个程序，判断一下开开和涛涛中午能吃到哪些菜。
输入格式
　　共4个整数a,b,c,d。分别表示开开买的A,B,C,D这4种原料的数量。每种原料不会超过30份。
输出格式
　　输出5行。其中第i行表示涛涛做的第i种菜的数目。
样例输入
3
1
2
4
样例输出
1
0
1
0
1

 * 
 * @author  Jan
 2018年5月21日
 *
 */
public class Test4 {
	public static void main(String[] args) {
		int [] source=new int[4];
		int [] ouput=new int[5];
	Scanner in=new Scanner(System.in);
	int [][]menu=new int[][]
			{
		{2,1,0,2},
		{1,1,1,1},
		{0,0,2,1},
		{0,3,0,0},
		{1,0,0,1}};
	for (int i = 0; i < source.length; i++) {
		source[i]=in.nextInt();
	}
	for (int i = 0; i < menu.length;) {
		if (source[0]>=menu[i][0]&&source[1]>=menu[i][1]&&source[2]>=menu[i][2]&&source[3]>=menu[i][3]) {
			source[0]-=menu[i][0];
			source[1]-=menu[i][1];
			source[2]-=menu[i][2];
			source[3]-=menu[i][3];
			ouput[i]++;
		}
		else {
			i++;
		}
	}
	for (int i = 0; i < ouput.length; i++) {
		System.out.println(ouput[i]);
	}
	
	}
	

}
