package com.lanqiao.practice1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader inReader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.valueOf(inReader.readLine());
		String s=inReader.readLine();
		char []c=s.toCharArray();
		int j=n-1;
		int flag=0;
		int count=0;
		for (int i = 0; i <j; i++) {//��ͷ�������ڶ���
			for (int k = j; k >=i; k--) {//�Ӻ�i��ʼ����
				if (k==i) {//ֻ��һ����ĸ�����
					if (n%2==0||flag==1) {
						System.out.println("Impossible");
						return ;
					}
					flag=1;
					count+=c.length/2-i;	
					//��¼�����ѵ����ķ��м�
				}
				else if (c[i]==c[k]) {
					
					for (int k2 = k; k2 <j; k2++) {
						char t=c[k2];
					c[k2]=c[k2+1];
					c[k2+1]=t;
					count++;
					}
					j--;
					break ;
					
				}
				
				
			}
			
		}
		System.out.println(count);
		
	}

}


