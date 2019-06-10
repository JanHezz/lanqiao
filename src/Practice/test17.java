package Practice;

public class test17 {
	public static void main(String[] args) {
		int sum=0;
		int all=0;
		for(int i=1;i<=100;i++)
		{
			sum+=i;
			all+=sum;
		}
		System.out.println(all);
		sum=0;
		for(int i=1;i<=100;i++)
		{
			sum+=((i+1)*i/2);
		}
		System.out.println(sum);
	}

}
