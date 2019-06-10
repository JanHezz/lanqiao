package Practice;

public class Test35 {
	public static void main(String[] args) {
		int max=0;
		int j=10;
		for (int i = 1; i<=j; i++) {
			int n=i;
		while(n!=1)
		{
			if (n>max) {
				max=n;
			}
			if (n%2==0) {
				n=n/2;
			}
			else {
				n=n*3+1;
			}
			System.out.println(n);
			
		}
		}
		System.out.println(max);
	}

}
