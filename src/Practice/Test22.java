package Practice;

import java.util.Scanner;

public class Test22 {
	public static boolean judge(int [] a)
	{
		for(int i=a.length-1;i>=1;i--)
		{
			if (a[i]!=a[i-1]) {
				return false;
			}
		}
		return true;
	}
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int count=0;
	int n=input.nextInt();

  input=new Scanner(System.in);
	int [] suger=new int[n];
	for (int i = 0; i < suger.length; i++) {
		suger[i]=input.nextInt();
	}
	while(true)
	{	//2 2 4
		if (judge(suger)) {
			break;
		}
		for (int i=0; i<n;i++) {
			
			if (suger[i]%2==1) {
				count++;
				suger[i]=suger[i]+1;;
			}
		    suger[i]=suger[i]/2;
		}
		int k=suger[0];
		for (int i=0; i<n-1;i++) {
			suger[i]+=suger[i+1];
			
			}
		suger[n-1]+=k;
	}	
System.out.println(count);
}
	}

	


