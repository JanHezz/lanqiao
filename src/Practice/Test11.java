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
	
		
		int length=h+w-1; //��Ҫ��ӡ��һ������
	    int konge=length-2*w;//һ��ʼ�м����ĳ���
		for(int i=0;i<h/2+1;i++) //��ӡǰһ����
		{
			konge=length-2*w-2*i;
			for(int j=i;j>0;j--) {
				System.out.print(".");
			       }
	if (konge>0) {//����O��ӡ3������
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
	else {//С��o��ӡ2������
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
		for(int i=h/2-1;i>=0;i--)//��ӡ��һ����
		{ 
			konge=length-2*i-2*w;
			for(int j=i;j>0;j--)
			{
				System.out.print(".");
			}
			if (konge>0)
				//����O��ӡ3������
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
			else //С��O��ӡ2������
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
