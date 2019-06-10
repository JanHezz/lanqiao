package work7;

import java.util.Scanner;

public class Test4 {
	//递归得出n个数字并返回
	public static int F(int n)
	{
		if (n==0) {
			return 0;
		}
		if (n==1) {
			return 1;
		}
		return F(n-1)+F(n-2);
	
		
	}
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int m;
		System.out.println("请输入测试数据的长度m<5");
		do {	 m=input.nextInt();
				 if (m>5) {
					System.out.println("请重新输入");
		   }
		} while (m>5);//m<=5时退出
		for(int i=0;i<m;i++)
		{
			System.out.println("请输入第"+(i+1)+"个");
			int j=input.nextInt();
			System.out.println(F(j));
			
		}
	}

}
