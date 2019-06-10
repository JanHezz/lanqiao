package Practice;

public class Test2 {
	public static void main(String[] args) {
		String s="vxvxvxvxvxvxvvx";
		char[] c=s.toCharArray();
		int num=777;
		for(int i=0;i<c.length;i++)
		{
			if (c[i]=='v') {
				num+=num;
			}
			else {
				num-=555;
			}
		}
		System.out.println(num);
	}

}
