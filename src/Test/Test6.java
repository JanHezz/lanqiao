package Test;

public class Test6 {
	public static int num=0;
	public static void F(int [] a,int start,int end)
	{
		
		if (start==end) {
			if (Check(a)) {
				num++;
			}
				return ;
		}
		for(int i=start;i<end;i++)
			
		{
			int temp=a[start];
			a[start]=a[i];
			a[i]=temp;
		   F(a, start+1, end);
		     a[i]=a[start];
		     a[start]=temp;
			
			 
		}
			
	}
	public static boolean Check(int [] a)
	{
		double A=a[0]/1.0;
		   double b=a[1]*1.0/a[2];
		   double c=(a[3]*100+a[4]*10+a[5])*1.0/(a[6]*100+a[7]*10+a[8]);
		   if (A+b+c==10f) {
			return true;
		}
			return false;
	}
public static void main(String[] args) {
	int [] a =new int[] {1,2,3,4,5,6,7,8,9};
	F(a, 0, a.length);
	System.out.println(num);
}
}
