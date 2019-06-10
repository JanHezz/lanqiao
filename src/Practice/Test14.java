package Practice;

import java.util.Scanner;

public class Test14 {
	/*
     0 1 2 3 4  5 6
  0  A B C D E F  G

　1　B A B C D E  F

　2　CBABCDE

　3　DCBABCD

　4　EDCBABC
	 *///规律是该元素是该元素位置 （i-j）绝对值加上'A'
	public static void main(String[] args) {
		int n,m;
		Scanner input =new Scanner(System.in);
		n=input.nextInt();
		m=input.nextInt();
		char[][] a=new char[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=(char) ('A'+Math.abs(i-j));
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
	}

}
