package Zt5;

public class Test2 {
	public static void main(String[] args) {
		int  year=0;
		int  day=0;
		int sum=0;
		for(int i=1900;i<2012;i++)//年份
		{
			year=i*10000;//8位数
			for(int j=1;j<=30;j++)//天
			{
				day=600+j;
				sum=year+day;
				if (sum%2012==0&&sum%3==0&sum%12==0) {
					System.out.println(sum);
				}
			}
		}
		
	}

}
