package work7;

import java.util.Scanner;

public class Test4 {
	//�ݹ�ó�n�����ֲ�����
	public static int F(int n)
	{
		if (n==0) {
			return 0;
		}
		if (n==1) {
			return 1;
		}
		return F(n-1)+F(n-2);
	
		
	}
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int m;
		System.out.println("������������ݵĳ���m<5");
		do {	 m=input.nextInt();
				 if (m>5) {
					System.out.println("����������");
		   }
		} while (m>5);//m<=5ʱ�˳�
		for(int i=0;i<m;i++)
		{
			System.out.println("�������"+(i+1)+"��");
			int j=input.nextInt();
			System.out.println(F(j));
			
		}
	}

}
