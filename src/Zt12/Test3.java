package Zt12;

import java.util.Random;

public class Test3 {
	public static void main(String[] args) {
		
		int count=0,sum,n=1,m=1;
		Random r=new Random();
		while(n<=10000)//做10000次试验
		{
			sum=100;
			while(m<=10)
			{
				int number=0;
				for(int i=1;i<=sum;i++)
				{
					int temp=r.nextInt(2);
					if (temp==1) {
						number++;
					}
				}
				sum-=number;
				m++;
			}
			n++;
			m=1;
			if (sum>=1) {//做完10次后还有反面
				count++;
			}
		}
		System.out.println(count/10000.0);
	}

}
