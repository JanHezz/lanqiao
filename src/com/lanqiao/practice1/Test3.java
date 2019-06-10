package com.lanqiao.practice1;

/**
 * 用天平称重时，我们希望用尽可能少的砝码组合称出尽可能多的重量。
如果只有5个砝码，重量分别是1，3，9，27，81
则它们可以组合称出1到121之间任意整数重量（砝码允许放在左右两个盘中）。

本题目要求编程实现：对用户给定的重量，给出砝码组合方案。
例如：
用户输入：
5
程序输出：
9-3-1
用户输入：
19
程序输出：
27-9+1

要求程序输出的组合总是大数在前小数在后。
可以假设用户的输入的数字符合范围1~121。

 * 
 * @author  Jan
 2018年5月18日
 *
 */
public class Test3 {
	
	public static void main(String[] args) {
		
		int weight[]=new int [] {1,3,9,27,81};
		int [] sign=new int [] {0,-1,1};
		int n=25;
		for (int i = 0; i < sign.length; i++) {
			for (int j = 0; j < sign.length; j++) {
				for (int j2 = 0; j2 < sign.length; j2++) {
					for (int k = 0; k < sign.length; k++) {
						for (int k2 = 0; k2 < sign.length; k2++) {
							int a=sign[i]*weight[0];
							int b=sign[j]*weight[1];
							int c=sign[j2]*weight[2];
							int d=sign[k]*weight[3];
							int e=sign[k2]*weight[4];
							if (a+b+c+d+e==n) {
								StringBuffer sb=new StringBuffer();
								sb.append(e!=0?(e>0?"+"+e:e):"");
								sb.append(d!=0?(d>0?"+"+d:d):"");
								sb.append(c!=0?(c>0?"+"+c:c):"");
								sb.append(b!=0?(b>0?"+"+b:b):"");
								sb.append(a!=0?(a>0?"+"+a:a):"");
								sb.deleteCharAt(0);
								System.out.println(sb.toString());
								return;
							}
						}
					}
				}
			}
		}
		
		
	}

}
