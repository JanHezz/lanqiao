package JavaA;

public class Test5 {
	public static void f(int n)
	{
		String s = "*";
		for(int i=0; i<2*n-3; i++) s += ".";
		s += "*";
	
		String s1 = s + "\n";
		String s2 = "";

		for(int i=0; i<n-1; i++){
			//System.out.println("=>"+s);
		//	System.out.println(s.substring(0,s.length()-3));
	        s = "." + s.substring(0,s.length()-3)+ "*";  //���
			s1 = s + "\n" + s1;
			s2 += s + "\n";
			
		
		}

			System.out.println(s1+s2);
	}
	
	public static void main(String[] args)
	{
		f(8);
	}

}
