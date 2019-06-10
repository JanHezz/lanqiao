package com.lanqiao.day0509;

public class Test3 {
	/**
	 * 有3堆硬币，分别是3,4,5
      二人轮流取硬币。
每人每次只能从某一堆上取任意数量。
不能弃权。
取到最后一枚硬币的为赢家。

求先取硬币一方有无必胜的招法。
	*/
	//如果要赢就要保证自己取完后是偶数堆
	//保证是偶数堆的同时要保证该堆为偶数
/*
	public static boolean F(int [] a,int i,int j,int max)
	{
		
		if (j==1) {
			return true;
		}
		if (j%2!=0) {
			
		}
		
	}
	*/
	public static void F(int [] a)
	{
		
		int sum=0;
	//由异或运算性质，0异或任何数，其结果=任何数，1异或任何数，其结果=把该数取反。 
		for(int i=0;i<a.length;i++)
		{
			sum^=a[i];
		}
		if (sum==0) {//如果等于0先手必输   定理
			System.out.println("losre");
			return ;
		}
		for(int i=0;i<a.length;i++)//
		{
			/*for(int j=1;j<=a[i];j++)
			{
				int x=a[i]-j;
				for(int k=0;k<a.length;k++)
				{
					if (k==i) {
						continue;
					}
					x^=a[k];
				}
				if (x==0) {
					System.out.println(a[i]+"--->"+j);
				}
				
			}*/
			int x=sum^a[i];//sum对堆进行异或运算得出的结果就是该堆剩下的数
			if (x<a[i]) {//x要小于堆的球数
				//1. 必须取
				//2.不能添加
				System.out.println("win"+a[i]+"---->"+x);
			}
			
		}
		
		
	}
	public static void main(String[] args) {
		int []a=new int [] {3,4,5};
		F(a);
	}

}
