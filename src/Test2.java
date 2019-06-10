
public class Test2 {
	public static int num=0;
	public static int f(int a,int nu)
	{
		if (a>39) {// 超过了
			return 0;
		}
		if (a==39) {//走到了39格
			if (nu%2==0) {
				return 1;
			}
			return 0;
		}
		
      return f(a+1, nu+1)+f(a+2, nu+1);
	}        //走一格           走  两格
	public static void main(String[] args) {
		
		System.out.println(f(0, 0));
	}

}
