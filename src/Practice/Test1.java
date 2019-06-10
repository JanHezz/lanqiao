package Practice;

import java.util.Scanner;

 class Test1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个整数");
		int n=input.nextInt();
		int m=10007;
		int a1=1,a2=1;
		int sum=0;
		
		for(int i=1;i<=n;i++)
		{
			sum=a1%m;
			int temp=a2;
			a2=(a1+a2)%m;
			a1=temp;
		}
		System.out.println(sum);
	}

}
