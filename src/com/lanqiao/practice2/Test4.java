package com.lanqiao.practice2;

import java.util.Scanner;

/**
 * 
��������
����������־Ҫ���º����꣬�������ѧ���ˡ����ڼ����������裬��ֻ���ü�����������������������������ԭ�������ˣ����Ǹ�������ԭ�ϱ�����ĸA,B,C,D��
�����������ڻ����Ĳ������֣�
����1�� ������������ ԭ�ϣ�AABDD
����2�� �������� ԭ�ϣ�ABCD
����3�� �������� ԭ�ϣ�CCD
����4�� ˮ�������� ԭ�ϣ�BBB
����5�� ��ζ�� ԭ�ϣ�AD
�����������ϣ�����ȥ���и���������һЩԭ�ϻ�������������û��ʲô�ƻ������ξ����������ִ��ԭ�ϣ�ÿ�ξ������˵��Ͽ�ǰ�������С���Ĳˡ�
������������дһ�������ж�һ�¿��������������ܳԵ���Щ�ˡ�
�����ʽ
������4������a,b,c,d���ֱ��ʾ�������A,B,C,D��4��ԭ�ϵ�������ÿ��ԭ�ϲ��ᳬ��30�ݡ�
�����ʽ
�������5�С����е�i�б�ʾ�������ĵ�i�ֲ˵���Ŀ��
��������
3
1
2
4
�������
1
0
1
0
1

 * 
 * @author  Jan
 2018��5��21��
 *
 */
public class Test4 {
	public static void main(String[] args) {
		int [] source=new int[4];
		int [] ouput=new int[5];
	Scanner in=new Scanner(System.in);
	int [][]menu=new int[][]
			{
		{2,1,0,2},
		{1,1,1,1},
		{0,0,2,1},
		{0,3,0,0},
		{1,0,0,1}};
	for (int i = 0; i < source.length; i++) {
		source[i]=in.nextInt();
	}
	for (int i = 0; i < menu.length;) {
		if (source[0]>=menu[i][0]&&source[1]>=menu[i][1]&&source[2]>=menu[i][2]&&source[3]>=menu[i][3]) {
			source[0]-=menu[i][0];
			source[1]-=menu[i][1];
			source[2]-=menu[i][2];
			source[3]-=menu[i][3];
			ouput[i]++;
		}
		else {
			i++;
		}
	}
	for (int i = 0; i < ouput.length; i++) {
		System.out.println(ouput[i]);
	}
	
	}
	

}
