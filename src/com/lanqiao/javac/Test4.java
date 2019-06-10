package com.lanqiao.javac;

public class Test4 {
	public static boolean Junge(int a[])
	{
		int a1=a[0]+a[2]+14+6;
		int a2=a[1]+a[2]+a[3]+a[4];
		int a3=a[3]+a[5]+11+6;
		int a4=a[4]+a[5]+a[6]+a[7];
		int a5=a[6]+a[9]+a[8]+11;
		int a6= a[7]+a[8]+a[10]+14;
		int a7=a[0]+a[9]+a[10]+a[1];
		if (a1==a2&&a2==a3&&a3==a4&&a4==a5&&a5==a6&&a6==a7) {
			System.out.println(a[1]+" "+a[2]+" "+a[3]+" "+a[4]);
			return true;
		}
		return false;
		
	}
	public static void Print(int [] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println();
	}
	public static void SevenAngle(int [] a,int start)
	{
			if (start==a.length-1) {
			
			Junge(a);
			return;
		}
		for(int i=start;i<a.length;i++)
		{
			int temp=a[start];
			a[start]=a[i];
			a[i]=temp;
			SevenAngle(a,start+1);
			temp=a[i];
			a[i]=a[start];
			a[start]=temp;
		}
	}
	public static void main(String[] args) {
		int [] a=new int[] {1,2,3,4,5,7,8,9,10,12,13};
		SevenAngle(a, 0);
	}


}
