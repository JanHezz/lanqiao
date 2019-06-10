package com.lanqiao.practice2;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
	
		Scanner in=new Scanner(System.in);
		int ans=0;
		int n=in.nextInt();
		if (n<=2) {
			ans=1*2;
			System.out.println(ans);
			return ;
		}
		
		if (n%2==1) {
			ans=n*(n-1)*(n-2);
		}
		else {
			if (n%3==0) {
				
				ans=(n-1)*(n-2)*(n-3);
			}
			else {
				ans=(n)*(n-1)*(n-3);
			}
			
		}
		System.out.println(ans);
		
	}
}
