package Practice;

public class Test9 {
	public static void F()
	{
		int sum=1225;
		for(int i=1;i<50;i++)
		{
			int temp=sum-(i+i+1)+(i*(i+1));
			for(int j=i+2;j<50;j++)
			{
				int temp1=temp-(j+j+1)+(j*(j+1));
				if (temp1==2015) {
					System.out.println(i+" "+(i+1)+" "+j+" "+(j+1));
				}
			}
		}
		
	}
	public static void main(String [] args)
	{
		int sum=1225;
		for(int i=1;i<50;i++)
		{
			int temp=sum-(i+i+1)+(i*(i+1));//第一次变号
			for(int j=i+2;j<50;j++)
			{ 
				 int temp1=temp-(j+j+1)+(j*(j+1));//第二次变号
				if (temp1==2015) {
					System.out.println(i+"  "+(i+1)+"  "+j+" "+(j+1) );
				}
			}
		}
		F();
		
	}
	


}
