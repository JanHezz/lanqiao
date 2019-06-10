package Test;

import java.math.BigInteger;

public class test7 {
	public static void main(String[] args) {
		BigInteger bigInteger=new BigInteger("214651645665476164654");
	
	BigInteger y=bigInteger.remainder(new BigInteger("9"));//对9取余
	String c=new String(y+"");
	int i=Integer.valueOf(c);//把余数转为int型
	String[] A=new String[]{"A","B","C","D","E","F","G","H","I"};
	if (i==0) {
		System.out.println(A[8]);
	}
	else {
		System.out.println(A[i-1]);
	}
	}

}
