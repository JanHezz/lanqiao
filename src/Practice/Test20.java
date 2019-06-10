package Practice;

import java.util.Scanner;
          
class Test20 {
	public static long F(long n)
	{
		if (n==0) {
			return 0;
		}
		return F(n-1)+n;
		
	}

	public static void main(String[] args) {
	 long n=new Scanner(System.in).nextLong();
	 System.out.println(F(n));
	 
	}

}
