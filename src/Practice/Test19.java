package Practice;

public class Test19 {
	public static int sum;
	public static void f(int [] a,int start,int end)
	{
		if (start==end) {
			if (judge(a)) {
				sum++;
			}
			return;
		}
		for(int i=start;i<a.length;i++)
		{
			int temp=a[start];
			a[start]=a[i];
			a[i]=temp;
			f(a ,start+1, end);
		    temp=a[start];
			a[start]=a[i];
			a[i]=temp;
				
		}
	}
	public static boolean judge(int [] a)
	{
		
		if (!(a[0]<a[1]&&a[0]<a[2]))return false;
		if (!(a[1]<a[3]&&a[1]<a[4]&&a[2]<a[5]&&a[2]<a[4])) return false;
		if(!(a[3]<a[6]&&a[3]<a[7]&&a[4]<a[7]&&a[4]<a[8]&&a[5]<a[8]&&a[5]<a[9])) return false;
		
		return true;
		
		
		
	}
	public static void main(String[] args) {
		int a[]=new int[] {0,1,2,3,4,5,6,7,8,9};
		int b[][]=new int [4][4];
		f(a, 0, 9);
		System.out.println(sum);
	}

}
