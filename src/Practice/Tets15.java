package Practice;

import java.util.Scanner;

public interface Tets15 {
	public static void main(String[] args) {
		int n,max,sum,min;
		int num[];
		sum=0;
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		num=new int[n];
		for(int i=0;i<n;i++)
		{
			num[i]=input.nextInt();
			sum+=num[i];
		}
		max=min=num[0];
		for(int i=0;i<n;i++)
		{
			if (max<num[i]) {
				max=num[i];
				
			}
			if (min>num[i]) {
				min=num[i];
			}
		}
		System.out.println(max+" "+min+" "+sum);
	}

}
