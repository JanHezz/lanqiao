package Zt9;

import java.util.Scanner;

public class Test2 {
	public static int F(int n)
	{
	 	if (n==0) { //�����Լ�Ӯ����n==0�����Լ�Ӯ��
			return 1;
		}
	 if ((n>=8&&!(F(n-8)==1))||(n>=7&&!(F(n-7)==1))||(n>=3&&!(F(n-3)==1))||(n>=1&&!(F(n-1)==1))) {
		return 1;
		//�����������һ������Ϊ1�����Լ��������ԼӸ���ֻҪ����1�ʹ����Լ�Ӯ
	}
	 else {
		 //����Լ�ûӮ�Ǿ�������
		return 0;
	}
		
		
		
		
		
		
	}
public static void main(String[] args) {
	/*Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	int [] a=new int[n];
	for (int i=0;i<n;i++) {
		input=new Scanner(System.in);
		a[i]=input.nextInt();
	}
	for (int i : a) {
		System.out.println(F(i));
	}*/
	System.out.println(F(8));
}
}
