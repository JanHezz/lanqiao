package Test;

import java.util.Scanner;
import java.util.Stack;

public class Test1 {
	public static void ExcelConvertate(Stack stack,long num)
	{
		if (num<=26) {
			stack.push((char)(num+64));
	     return ;
		  }
		if (num%26==0) {//临界点刚好能整除那么最后输出的肯定就是z
			stack.push((char)(26+64));
			num-=1;//刚好能整除的情况不用进位而要退一位
		}
		else {
			stack.push((char)(num%26+64));
		}
		 ExcelConvertate(stack, num/26);
		
		
		
	}
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	while(true)
	{
		Stack stack =new Stack();
		ExcelConvertate(stack,input.nextLong());
    while(!stack.isEmpty())
    {
    	System.out.print(stack.pop());
    }
    System.out.println();
   
	
		}
}
	

}

