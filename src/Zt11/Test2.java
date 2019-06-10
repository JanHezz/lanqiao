package Zt11;


public class Test2 {
	public static void fun(int x,int y)
	{
		double time=1f;
		while(time<=120f)
		{
			if (time%2==0) {
				y-=x;
			}
			if (time%4==0) {
			    y*=2;
			}
			if (time%6==0) {
				x*=2;
			}
		 time+=1;
		}
		System.out.println("X:"+x);
		System.out.println("Y:"+y);
	}
public static void main(String[] args) {
	
	
	fun(10, 89);
	fun(10, 90);
}
}
