package com.lanqiao.practice2;

import java.util.Scanner;

/**
 * �����������������
 * @author  Jan
 2018��5��22��
 *
 */
public class Test8 {
static 	char[] a;
static char[] b;
        /**
         * 
         * @param ls ����Ŀ�ͷ
         * @param led ����Ľ�β
         * @param rs  �����Ŀ�ͷ
         * @param ed   �����Ľ�β
         * 
         *@return void
         */
	static void F(int ls,int led,int rs,int ed)
	{
		
		if (ls>led||rs>ed) {
			return ;
		}
		else {
			char temp=b[ed];//��������ĸ�
			System.out.print(temp);
			
			for (int i = ls; i <=led; i++) {
				if (temp==a[i])//�ҵ�����Ϊ��������
				{
				F(ls, i-1, rs, rs+(i-1-ls));//������
				F(i+1, led,rs+(i-ls), ed-1);//������
				return ;
					
				}
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String A=in.nextLine();
		String B=in.nextLine();
		 a=A.toCharArray();
	  b=B.toCharArray();
		int lena=a.length;
		int lenb=b.length;
		F(0, lena-1, 0, lenb-1);
	}

}
