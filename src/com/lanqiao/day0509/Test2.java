package com.lanqiao.day0509;

import java.util.Scanner;

/**
 * 
 * K��ʦ��ֽ�ϻ���һ��n�����ӣ�ҪС����������������������ĸ��

1. �ֵ�ĳ�����ʱ��ֻ����ĳ���ո������� L �� O
2. ˭������ĸ����ˡ�LOL����������˭��ʤ��
3. ������и��Ӷ������ˣ����޷����LOL����ƽ�֡�

С�������˼��ζ����ˣ����ܲ�����ϣ�������ü���������⿪����ա�

����������ʽΪ��
��һ�У�����n��n<10������ʾ������n����ʼ���档
��������n�У�ÿ��һ��������ʾ��ʼ�ľ��档
  ���磺��******��, ��ʾ��6���ո񡣡�L****��,   ��ʾ�����һ����ĸL�������ұ���4���ո�

Ҫ�����n�����֣���ʾ��ÿ�����棬���С�������K��ʦ��������ǿ�ŷ���ʱ��С������ý����
1 ��ʾ��Ӯ
-1 ��ʾ����
0 ��ʾ���Ա�ƽ

���磬
���룺
4
***
L**L
L**L***L
L*****L

�����Ӧ�������
0
-1
1
1
 * @author  Jan
 2018��5��10��
 *
 */
public class Test2 {
	
	
	public static int is_Lol(String x)
	{
	
		if (x.contains("LOL")) return -1;
		if (!x.contains("*")) return 0;
		int ping=0;
		for(int i=0;i<x.length()-1;i++)
		{
			if (x.substring(i, i+1).equals("*")) {//�пո��ģ��
				//�пո���L���
				StringBuffer sB=new StringBuffer(x);
				sB.replace(i, i+1, "L");			
				switch (is_Lol(sB.toString())) {
				case -1: return 1;	  //�Է����Ǿʹ����Լ�Ӯ  �����Ӯ��ֱ��return��
				case 1:ping=-1;  //�Է�Ӯ���Լ���
				}
				//��O���
				sB.replace(i, i+1, "O");
				switch (is_Lol(sB.toString())) {
				case -1:return 1;
				case 1:ping=-1;break;
				}	
			}	
		}
		if (ping==0) {
			return 0;
		}
		return -1;
	
	}
 public static void main(String[] args) {
	 Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	String [] xStrings=new String[n];
	for (int i = 0; i < n; i++) {
		in=new Scanner(System.in);
		String xString=in.nextLine();
	    xStrings[i]=xString;
	}
	for (String string : xStrings) {
		System.out.println(is_Lol(string));
	}

}

}
