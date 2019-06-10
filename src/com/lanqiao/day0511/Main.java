package com.lanqiao.day0511;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
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
				num[i]--;//先减的目的是因为不能出现约数跟倍数不能出现自己本身
				for (int j =1; j <= 100; j++) {	
					if (num[j]!=0&&(i%j==0||j%i==0)) {//如果存在，且符合条件加入对应的list表
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