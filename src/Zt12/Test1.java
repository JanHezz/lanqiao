package Zt12;

import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		
		int count=0,sum,n=1,m=1;
		Random r=new Random();
		while(n<=10000)//��10000������
		{
			sum=100;
			while(m<=10)
			{
				if (sum>=1) {//����������Ƿ���
					int i=r.nextInt(sum)+1;//������ܻ�������ĸ���
				    sum-=i;
				}
				else {
					break;
				}
				m++;
			}
			n++;
			m=1;
			if (sum>=1) {//����10�κ��з���
				count++;
			}
		}
		System.out.println(count/10000.0);
	}

}
