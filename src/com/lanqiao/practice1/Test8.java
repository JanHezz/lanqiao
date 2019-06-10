package com.lanqiao.practice1;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();int m=in.nextInt();
		int [][] grid=new int [n][n] ; 
		int [][]grid2=new int [n][n] ;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <n; j++) {
			grid2[i][j]=grid[i][j]=in.nextInt();
			}
		}
		
		if (m==0) {//等于0时对角线为1
			for (int i = 0; i < grid2.length; i++) {
				for (int j = 0; j < grid2.length; j++) {
					if (i==j) {
						System.out.print(1+" ");
					}
					else {
						System.out.print(0+" ");
					}
				}
				System.out.println();
			}
		}
		if (m==1) {//1次幂输出本身
			for (int i = 0; i < grid2.length; i++) {
				for (int j = 0; j < grid2.length; j++) {
					System.out.print(grid[i][j]+" ");
				}
				System.out.println();
			}
		}
		if (m>1) {	
			for(int count=1;count<m;count++)
		{
			int temp[][]=new int [n][n];
		for (int i = 0; i <n; i++) {//行
		
			for (int j = 0; j < n; j++) {//列
				for (int j2 = 0; j2 <n; j2++) {
					temp[i][j]+=grid[i][j2]*grid2[j2][j];	
				}	
			}
		      }
		   grid2=temp;
		}
		
		for (int i = 0; i < grid2.length; i++) {
			for (int j = 0; j < grid2.length; j++) {
				System.out.print(grid2[i][j]+" ");
			}
			System.out.println();
		}
		
	 }
	}

}
