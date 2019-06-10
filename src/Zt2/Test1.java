package Zt2;

import java.util.Scanner;
import java.util.Stack;

public class Test1 {
	public static void Change(Stack s,int num)
	{
		if (num<=25) {
			s.push(num%26);
			return ;
		}
		if (num%26==0) {
			s.push(26);
			num--;
		}
		else {
				s.push(num%26);
		}
	
		num=num/26;
		Change(s, num);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	
		System.out.println("请输入0————100的整数");
		int n=input.nextInt();
		String[] address=new String[n]; 
		for(int i=0;i<n;i++)//输入地址
		{
			input=new Scanner(System.in);
			address[i]=input.nextLine();
		}
		for(int i=0;i<n;i++)//地址转换
		{
			String row=new String();
			String add=address[i];
			int r=add.indexOf("R");//获取R的位置
			int c=add.indexOf("C");//获取C的位置
			String R=add.substring(r+1,c);
			String C=add.substring(c+1, add.length());
			int num=Integer.valueOf(C);
			Stack stack=new Stack();
			Change(stack, num); //对列进行进制转换
			while(!stack.isEmpty())
			{
				
	        	char ch=(char)((int)stack.pop()+64);//把数字转换成字母AsCll码	
				System.out.print(ch);
			}
			System.out.println(R);
			
		}
		
		
	}

}
