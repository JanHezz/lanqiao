package Test1;

public class Test5 {
	
		private static int n = 1;
		
		public static void write(String msg)
		{
			String filename = "t" + n + ".log";
			n =n%3+1;
			System.out.println("write to file: " + filename + " " + msg);
		}
		public static void main(String[] args) {
			for(int i=0;i<20;i++)
			{
				write("dad");
			}
		}
	
}
