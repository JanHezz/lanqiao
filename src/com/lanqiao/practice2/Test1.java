package com.lanqiao.practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * ��������
������֪n��m����ӡn^1��n^2��...��n^m��Ҫ���þ�̬����ʵ�֡�n^m��ʾn��m�η�����֪n��m����ӡn^1��n^2��...��n^m��Ҫ���þ�̬����ʵ�֡�n^m��ʾn��m�η�����ÿ����ʾ5������ÿ������Ϊ12���Ҷ��룩
��������
һ��������ĿҪ������뷶����
����
 *
 */
public class Test1 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();	int m=in.nextInt();
		int sum=1;
		for (int i = 1; i <=m; i++) {
			sum*=n;
			if ((i-1)%5==0) {
				System.out.println();
			}
			System.out.print(String.format("%12d", sum));
			
		}	
	}
	

}
