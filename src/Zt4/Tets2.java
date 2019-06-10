package Zt4;

import java.math.BigInteger;

public class Tets2 {
	public static void main(String[] args) {
	BigInteger sum=BigInteger.ZERO;//∏≥≥ı÷µ
	BigInteger base=new BigInteger("2");
		for(long i=0;i<=63;i++)
		{
			// 1  2  4
			//2^0 2^1  2^2
		sum=sum.add(BigInteger.valueOf((long)Math.pow(2, i)));
		}
		System.out.println(sum);

	}

}
