package Test1;

public class Test7 {
	public static void main(String[] args) {
		int Ofenzi,Ofenmu,Tfenzi,Tfenmu,errorsum;
		System.out.println(11/23.0);
		System.out.println(1/6.0);
		System.out.println(Math.abs(11/23.0-(1/6.0)));
		int count=0;
		for(int i=1;i<=9;i++)
		{    Ofenzi=i;
			for(int j=1;j<=9;j++)
			{
				if (j==i) {
					continue;
				}
				Ofenmu=j;
				
				for(int k=1;k<=9;k++)
				{
					Tfenzi=k;
					
					for(int l=1;l<=9;l++)
					{
						if (k==l) {
							continue;
						}
						Tfenmu=l;
					int x=Ofenzi*10+Tfenzi;
					int y=Ofenmu*10+Tfenmu;
					double sum=x/(y*1.0);
					int x1=	Ofenzi*Tfenzi;
					int y1=Ofenmu*Tfenmu;
					double sum2=x1/(y1*1.0);
					
					if (Math.abs(sum2-sum)<0.000001f) {
						System.out.println(i+" "+j+" "+k+" "+l);
						count++;
					}
						
					}
				}
				
			}
		}
		System.out.println(count);
	}

}
