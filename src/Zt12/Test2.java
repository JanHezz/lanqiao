package Zt12;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Test2 {
	public static String ReVerse(String num)
	{
		if (num.length()==1) {
		return num;
	  }
		return ReVerse(num.substring(1))+num.charAt(0);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String num=input.nextLine();
		if (num.length()!=16) {
			System.out.println("失败");
			return;
		}
		num=ReVerse(num);//反转
		int oodSum=0;
		int  EvenSum=0;
		for(int i=1;i<=num.length();i++)
		{	
		int temp=Integer.valueOf(num.charAt(i-1)+"");
			if (i%2==0) {//偶数
				temp*=2;
				if (temp>=10) {
					temp-=9;
				}
				EvenSum+=temp;
			}
			else {//奇数
				oodSum+=temp;
			}
			
		}
		int sum=oodSum+EvenSum;
		if (sum%10==0) {
			System.out.println("成功");
		}else {
			System.out.println("失败");
		}
		
	}

}
//5432123456788881
