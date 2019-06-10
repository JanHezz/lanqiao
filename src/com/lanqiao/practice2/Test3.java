package com.lanqiao.practice2;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		
		String str="0";
		
		while(n>=1)
		{
			String str2="";
	     for (int i = 0; i < str.length(); i++) {
			str2+=Integer.valueOf(str.substring(i, i+1))==0?"1":"01";
		}
          str=str2;
	      n--;
		}
		System.out.println(str);
	}

}
