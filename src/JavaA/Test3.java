package JavaA;

import java.sql.Array;
import java.util.Arrays;

public class Test3 {
	public static void main(String[] args) {
		
int A,B,C;
 for(int i=111;i<=333;i++)
 {
	
	 A=i;
	B=2*A;
	C=3*A; 
	
	if (String.valueOf(B).contains("0")||String.valueOf(C).contains("0")) 
	{
		continue;
	}
	else {
		String string=""+A+B+C;
		
		char [] c=string.toCharArray();
		Arrays.sort(c);
		if ("123456789".equals(String.valueOf(c))) {
			System.out.print(A+" ");
		}
	}
	
 }
	}
	
}
