package com.lanqiao.practice1;

import java.util.Scanner;

/**
 * ��������
����Tom�������ڸ��о�������һ�Ź��ڻ���Ŀγ̣���һ������������Ϊͷ�ۣ�һ��Ⱦɫ�����г�ǧ���������ԣ����Ǵ�0��ʼ��ţ��������򣬼�ǧ���������ڡ�
��������˵���ڶ�ѧ�������1234567009��λ���ϵļ��ʱ���⿴�������Ǻ���׼ȷ��������ġ�
�������ԣ������е���Ҫһ��ϵͳ��Ȼ��������12 3456 7009ʱ���������Ӧ�����
����ʮ������ǧ�İ���ʮ������ǧ���
�����ú���ƴ����ʾΪ
����shi er yi san qian si bai wu shi liu wan qi qian ling jiu
����������ֻ��Ҫ������Ϳ����ˡ�
������������ǰ����������һ��ϵͳ������һ�����������ִ���������������Ķ�д�Ĺ淶תΪ����ƴ���ִ������ڵ�����������һ���ո���񿪡�
����ע������ϸ��չ淶������˵��10010��������yi wan ling yi shi�������ǡ�yi wan ling shi������100000��������shi wan�������ǡ�yi shi wan������2000��������er qian�������ǡ�liang qian����
 * @author  Jan
 2018��5��21��
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
