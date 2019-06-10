package com.lanqiao.practice2;

import java.util.Scanner;

/**
 * 根据中序后序求先序
 * @author  Jan
 2018年5月22日
 *
 */
public class Test8 {
static 	char[] a;
static char[] b;
        /**
         * 
         * @param ls 中序的开头
         * @param led 中序的结尾
         * @param rs  后续的开头
         * @param ed   后续的结尾
         * 
         *@return void
         */
	static void F(int ls,int led,int rs,int ed)
	{
		
		if (ls>led||rs>ed) {
			return ;
		}
		else {
			char temp=b[ed];//输出后续的根
			System.out.print(temp);
			
			for (int i = ls; i <=led; i++) {
				if (temp==a[i])//找到根分为左右子树
				{
				F(ls, i-1, rs, rs+(i-1-ls));//左子树
				F(i+1, led,rs+(i-ls), ed-1);//右子树
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
