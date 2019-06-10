package Practice;

import java.util.Scanner;

public class Test11 {
	public static void F(int w,int h )
	{ /****.....*** 0  5
		.***...***. 1  3
		..***.***.. 2  1
		...*****... 3
		....***.... 5
		...*****...
		..***.***..
		.***...***.
		***.....***
		*/
	
		
		int length=h+w-1; //需要打印的一个长度
	    int konge=length-2*w;//一开始中间留的长度
		for(int i=0;i<h/2+1;i++) //打印前一部分
		{
			konge=length-2*w-2*i;
			for(int j=i;j>0;j--) {
				System.out.print(".");
			       }
	if (konge>0) {//大于O打印3个部分
		for(int j=w;j>0;j--)
		{
			System.out.print("*");
		}
		for(int j=0;j<konge;j++)
		{System.out.print(".");}
		for(int j=w;j>0;j--)
		{
			System.out.print("*");
		}	
	}
	else {//小于o打印2个部分
		for(int j=0;j<length-2*i;j++)
		{
			System.out.print("*");
		}
	}
			for(int j=i;j>0;j--) {
				System.out.print(".");
			}
			
			System.out.println();
		}
		for(int i=h/2-1;i>=0;i--)//打印后一部分
		{ 
			konge=length-2*i-2*w;
			for(int j=i;j>0;j--)
			{
				System.out.print(".");
			}
			if (konge>0)
				//大于O打印3个部分
			{
				for(int j=w;j>0;j--)
				{
					System.out.print("*");
				}
				for(int j=0;j<konge;j++)
				{System.out.print(".");}
				
				for(int j=w;j>0;j--)
				{
					System.out.print("*");
				}
			
			}
			else //小于O打印2个部分
			{
				for(int j=0;j<length-2*i;j++)
				{
					System.out.print("*");
				}	
			}
			for(int j=i;j>0;j--) 
			{
				System.out.print(".");
			}
			
			System.out.println();
		}
		
		
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int m=input.nextInt();
		int n=input.nextInt();
		if (m<n&&n%2!=0&&n>3&&n<1000) {
			F(m, n);
		}
		
	}

}
