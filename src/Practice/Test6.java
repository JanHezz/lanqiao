package Practice;

import java.util.Vector;

public class Test6 {
	public static int f(int n, int m)
	{
		n = n % m;	
		Vector v = new Vector();
		
		for(;;)
		{
			
			v.add(n);
			n *= 10;
			n = n % m;
			if(n==0) return 0;
		
			if(v.indexOf(n)>=0)
				return v.size()-v.indexOf(n);  //МоїХ
		}
	}
	public static int f1(int n, int m)
	{
		n = n % m;	
		Vector v = new Vector();
		
		for(;;)
		{
			
			v.add(n);
			n *= 10;
			n = n % m;
			if(n==0) return 0;
			if(v.indexOf(n)>=0) return v.size()- v.indexOf(n);  //МоїХ
		}
	}
	public static void main(String[] args) {
		//System.out.println(f(11, 13));
		System.out.println(f1(11, 13));
	}

}
