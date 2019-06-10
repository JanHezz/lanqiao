package Practice;

import java.util.Scanner;

public class Test5 {
	public static double Fenshu(double n)
	{
		if (n==100) {
			return n;
		}
		return n/(n+Fenshu(n+1.0));
	}
	 public static void main(String[] args){  
		 System.out.println(Fenshu(1.0));
	        Scanner sc = new Scanner(System.in);  
	        while(sc.hasNext()){  
	            double n = sc.nextDouble();  
	            double sum = n+2;  
	            for(double i=n;i>=1;i--){  
	                sum=i+(i+1)/sum;
	                System.out.println(sum);
	            }  
	            System.out.println(1/sum);                 //要注意最前面的 1 ，不要被坑  
	            System.out.println(String.format("%.5f", 1/sum));     
	        }  
	       // System.out.println(String.format("%.5f", Fenshu(1.0)));
	    } 
	

}
