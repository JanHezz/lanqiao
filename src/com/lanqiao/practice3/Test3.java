package com.lanqiao.practice3;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int k=in.nextInt();
		int []a=new int [k];
		for (int i = 0; i < a.length; i++) {
			a[i]=in.nextInt();
		}
		int m=in.nextInt();
		int [][] q=new int[m][3];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < q[0].length; j++) {
				q[i][j]=in.nextInt();
			}
		}
		for (int i = 0; i < q.length; i++) {
			int st=q[i][0];
			int ed=q[i][1];
			int num=q[i][2];
			int len=ed-st+1;
			int []temp=new int [len];
			for (int j =st-1,k1=0; j <=ed-1; j++,k1++) {
				temp[k1]=a[j];
			}
			Arrays.sort(temp);
			System.out.println(temp[len-num]);
		}
		
		
	}

}
