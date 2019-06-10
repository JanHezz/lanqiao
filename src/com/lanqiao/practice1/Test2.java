package com.lanqiao.practice1;


import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		
		int [] a=new int[1000];
		int [] b=new int[1000];
		int [] c=new int[1000];
		Scanner in=new Scanner(System.in);
		String aS=in.nextLine();
		String bS=in.nextLine();
		for(int i=aS.length()-1;i>=0;i--)
		{
			a[aS.length()-i-1]=Integer.parseInt(aS.substring(i,i+1));
		}
		for(int i=bS.length()-1;i>=0;i--)
		{
			b[bS.length()-i-1]=Integer.parseInt(bS.substring(i,i+1));
		}
		
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i]+b[i];
		}
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			if (c[i]>9) {
				c[i+1]=c[i+1]+c[i]/10;
				c[i]=c[i]%10;
			}
			if (c[i]>0) {
				count=i;
			}
			
		}
		for(int i=count;i>=0;i--)
		{
			System.out.print(c[i]);
		}
	}

}
