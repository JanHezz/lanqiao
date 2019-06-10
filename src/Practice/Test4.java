package Practice;

public class Test4 {
	public static void main(String[] args) {
		long sum=0;
		long end=0;
		long bit;
		long temp;
		for(int i=1;i<=10000;i++)
		{
			bit=1;//位数
			int num=i;
			int j=0;
			 temp=(long)Math.pow(i, 3);
			 while(num>0)//判断num时几位数
			 {
				 j++;
				 num=num/10; 
			 }
			 while(j-->0)
			 {
				 bit=bit*10;
			 }
			 end=temp%bit;
			 if (end==i) {
				 sum++;
				System.out.println(i);
			}
			 
					}
	System.out.println(sum);
	}

}
