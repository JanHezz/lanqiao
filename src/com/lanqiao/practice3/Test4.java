package com.lanqiao.practice3;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
	
		Scanner in=new Scanner(System.in);
		int min=3000;
		
		int []a=new int [3] ;
		int source[][]=new int [3][3];
		for (int i = 0; i <a.length; i++) {
			a[i]=in.nextInt();
		}
		for (int i = 0; i < source.length; i++) {
			for (int j = 0; j < source.length; j++) {
				source[i][j]=in.nextInt();
			}
		}
		
		int min1[]=new int [4];
		for (int i = 1; i <=1000; i++) {
			for (int j = 1; j <=i; j++) {
				for (int k = 1; k <=i; k++) {
					if ((i+j+k)>min) {
						break ;
					}
			int x=source[0][0]*i+source[1][0]*j+source[2][0]*k;		
			int y=source[0][1]*i+source[1][1]*j+source[2][1]*k;	
			int z=source[0][2]*i+source[1][2]*j+source[2][2]*k;
			if (x%a[0]==0&&y%a[1]==0&&z%a[2]==0) {
				if (x/a[0]==y/a[1]&&y/a[1]==z/a[2]) {
					int sum=x+y+z+x/a[0];
					if (sum<min) {
						min1[0]=i;
						min1[1]=j;
						min1[2]=k;
						min1[3]=x/a[0];
						min=sum;
					}
				}
			}
			
				}
			}
		}
		
		System.out.println(min1[0]+" "+min1[1]+" "+min1[2]+" "+min1[3]);
	}

}
