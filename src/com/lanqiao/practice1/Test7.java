package com.lanqiao.practice1;

import java.util.Scanner;

/**
 * 问题描述
　　Tom教授正在给研究生讲授一门关于基因的课程，有一件事情让他颇为头疼：一条染色体上有成千上万个碱基对，它们从0开始编号，到几百万，几千万，甚至上亿。
　　比如说，在对学生讲解第1234567009号位置上的碱基时，光看着数字是很难准确的念出来的。
　　所以，他迫切地需要一个系统，然后当他输入12 3456 7009时，会给出相应的念法：
　　十二亿三千四百五十六万七千零九
　　用汉语拼音表示为
　　shi er yi san qian si bai wu shi liu wan qi qian ling jiu
　　这样他只需要照着念就可以了。
　　你的任务是帮他设计这样一个系统：给定一个阿拉伯数字串，你帮他按照中文读写的规范转为汉语拼音字串，相邻的两个音节用一个空格符格开。
　　注意必须严格按照规范，比如说“10010”读作“yi wan ling yi shi”而不是“yi wan ling shi”，“100000”读作“shi wan”而不是“yi shi wan”，“2000”读作“er qian”而不是“liang qian”。
 * @author  Jan
 2018年5月21日
 *
 */
public class Test7 {
static	String [] num=new String[] {"ling","yi","er","san","si","wu","liu","qi","ba","jiu","si"};
	static String F(String s)
	{   
		
		int flag=1;
		int len=s.length();
		String ans="";
		char [] t=s.toCharArray();
		if (len>=4) {
			if (t[0]!='0') {
			ans+=num[t[0]-'0']+" "+"qian"+" ";
			}
			else {
				flag=0;
			}
		}
		if (len>=3){
			if(t[len-3]!='0') {	
				if (flag==0) {
					ans+=num[0]+" ";
					flag=1;
				}
			ans+=num[t[len-3]-'0']+" "+"bai"+" ";	
			}
			else {
				flag=0;
			}
		}
		if (len>=2) {
			if (t[len-2]!='0') {
				if (flag==0) {
					ans+=num[0]+" ";
					flag=1;
				}
				if (t[len-2]=='1') {
					if (len!=2) {
						ans+="yi shi"+"  ";					
				      }
					else {
						ans+="shi";
					}
				}
				else
				{
					ans+=num[t[len-2]-'0']+" "+"shi"+" ";
				}

			}
			else
			{
				flag=0;
			}
		}
		if (len>=1) {
			if (t[len-1]!='0') {
				if (flag==0) {
					ans+=num[0]+" ";
				}
			ans+=num[t[len-1]-'0']+" ";	
			}
			
		}
		return ans;
	}
	
	public static void main(String[] args) {		
		Scanner in=new Scanner(System.in);
		String n=in.nextLine();
		String yi ="";
		String wan="";
		String qian="";
		
		if (n.length()>8) {
			 yi=n.substring(0, n.length()-8);
			 wan=n.substring(n.length()-8,n.length()-4);
			qian=n.substring(n.length()-4,n.length());
		}
		else if (n.length()>4) {
			
		wan=n.substring(0, n.length()-4);
		 qian=n.substring(n.length()-4, n.length());
		}
		else {
		 qian=n;
		} 
		if (yi.length()!=0) {
			System.out.print(F(yi)+" "+"yi"+" ");
		}
		if (wan.length()!=0) {
		String wa=F(wan);
		if (wa.length()>0) {
			System.out.print(wa+" "+"wan"+" ");
		}
		}
		if (qian.length()!=0) {
     		System.out.print(F(qian));
		}
	}

}
