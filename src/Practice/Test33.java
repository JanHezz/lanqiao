package Practice;

import java.util.ArrayList;
import java.util.List;

public class Test33 {
	public static int Judge(int [] b,int num,int now)
	{    for(int i=now;i>=0;i--)
	    {
		if (num==b[i]) {
			return i;
		 }
	    }
		return -1;
	}
	public static int judge1(int [] b,int start,int end)
	{
	
		List<Integer> a=new ArrayList<Integer>();
		for(int i=start+1;i<end;i++)
		{
			if (!a.contains(b[i])) {
				a.add(b[i]);
			}
		}
		return a.size();
		
	}
		
	
	
	public static void main(String[] args) {
		int [] a=new int [] {1,2,4,2,4};
		int [] b=new int [a.length];
		int [] c=new int [a.length];
		for(int i=0;i<a.length;i++ )
		{
			System.out.print(a[i]+"  ");
			if (Judge(b, a[i], i)==-1) {
				c[i]=-a[i];
			}
			else  {
				int start=Judge(b, a[i], i);
				c[i]=judge1(b, start, i);
			}
			b[i]=a[i];
		}
		System.out.println();
		for(int i=0;i<b.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		
	}
//-1 0 -2 -3 1 1 2 2 0 0 2 2
}
