package Zt12;

import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		
		int count=0,sum,n=1,m=1;
		Random r=new Random();
		while(n<=10000)//做10000次试验
		{
			sum=100;
			while(m<=10)
			{
				if (sum>=1) {//如果还有数是反面
					int i=r.nextInt(sum)+1;//随机可能会是正面的个数
				    sum-=i;
				}
				else {
					break;
				}
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
