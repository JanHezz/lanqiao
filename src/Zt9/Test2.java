package Zt9;

import java.util.Scanner;

public class Test2 {
	public static int F(int n)
	{
	 	if (n==0) { //假设自己赢所以n==0所以自己赢了
			return 1;
		}
	 if ((n>=8&&!(F(n-8)==1))||(n>=7&&!(F(n-7)==1))||(n>=3&&!(F(n-3)==1))||(n>=1&&!(F(n-1)==1))) {
		return 1;
		//如果对手走完一步后结果为1代表自己输了所以加个！只要不是1就代表自己赢
	}
	 else {
		 //如果自己没赢那就是输了
		return 0;
	}
		
		
		
		
		
		
	}
public static void main(String[] args) {
	/*Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	int [] a=new int[n];
	for (int i=0;i<n;i++) {
		input=new Scanner(System.in);
		a[i]=input.nextInt();
	}
	for (int i : a) {
		System.out.println(F(i));
	}*/
	System.out.println(F(8));
}
}
