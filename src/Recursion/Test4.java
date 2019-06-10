package Recursion;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Test4 {
	//求 m 得分裂的所有式子
	/*
	 * 6
	 * 5+1
	 * 4+2 4+1+1
	 * 3+3 3+2+1 3+1+1+1
	 * 2+2+2 2+2+1+1 2+1+1+1+1
	 * 1+1+1+1+1+1
	 */

	public static void  F1(int m,int k,int [] a )
	{
		if (k>=a.length) {
			return ;
		}
		if (m<0) {
			for(int i=0;i<k;i--)
			{
				if (i==(k-1)) {
				System.out.print(a[i]);
				}
			else {
				System.out.print(a[k]+" ");
			}
				
			}
			System.out.println();
		}
		
		for(int i=m;i>0;i--)
		{
			a[k]=i;
			F(m-i, k+1, a);
		}
		
	}
	//求最小公倍数
	public static int Lcm(int a,int b)
	{
		return a*b/Gcd(a, b);
	}
	//  求最小公约数
	public static int Gcd(int m,int n)
	{
		if (n==0) {
			return m;
		}
		return Gcd(n, m%n);
	}
	public static void F(int m,int k ,int [] a)
	{    if(k>6) return;
		if(m<=0) {
			for (int i=0;i<k;i++) {
				
			System.out.print(a[i]);
			if (i+1<k)System.out.print("+");
		}
			System.out.println();
				return;
	 }
		for(int i=m;i>0;i--)
		{
			if(k>0&&i>a[k-1])continue;
			a[k]=i;
			F(m-i,k+1,a);
		}
		//6
		//5 1
		//4  2
		
	}
	public static void main(String[] args) {
	
	/*	F(6,0,new int[6]);*/
		F1(6, 0, new int[6]);
		System.out.println(Gcd(2, 200));
	}

}
