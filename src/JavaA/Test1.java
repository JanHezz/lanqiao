package JavaA;

public class Test1 {
    public static void main(String[] args) {
		int m=1543;
		int count=0;
		while(m>0)
		{
			
			if (m%2!=0) {
				m--;
				count++;
			  }
			m=m/2;
		}
		System.out.println(count);
	}
}
