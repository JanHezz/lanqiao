package com.lanqiao.greedy;

import java.util.Scanner;

/**
 * 例2 （NOIP1998tg）设有n个正整数，将他们连接成一排，组成一个最大的多位整数。例如:n=3时，3个整数13,312,343,连成的最大整数为:34331213
又如:n=4时,4个整数7,13,4,246连接成的最大整数为7424613
输入：N 
N个数
输出:连接成的多位数
算法分析：此题很容易想到使用贪心法，在考试时有很多同学把整数按从大到小的顺序连接起来，测试题目的例子也都符合，但最后测试的结果却不全对。按这种贪心标准，我们很容易找到反例：12，121 应该组成12121而非12112,那么是不是相互包含的时候就从小到大呢？也不一定，如：12，123 就是12312而非12112,这样情况就有很多种了。是不是此题不能用贪心法呢？
其实此题是可以用贪心法来求解，只是刚才的贪心标准不对，正确的贪心标准是：先把整数化成字符串，然后再比较a+b和b+a，如果a+b>b+a，就把a排在b的前面，反之则把a排在b的后面。
源程序：

 * 
 * @author  Jan
 2018年5月13日
 *
 */
public class Test2 {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int [] a=new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=in.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length-1; j++) {
				
				//贪心算法核心
				if (Integer.valueOf((a[i]+a[j]+""))<Integer.valueOf((a[j]+a[i]+""))){
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
	
				}
				
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		
		
		
		
	}

}
