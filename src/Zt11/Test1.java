package Zt11;

public class Test1 {
public static void main(String[] args) {
	int a,b,c,d,e,A,B,C;
	
	for(a=1;a<10;a++) {
		for(b=0;b<10;b++)
		{if(b==a)continue;
			for(c=0;c<10;c++)
			{
				if (c==a||c==b) {
					continue;
				}
				for(d=0;d<10;d++)
				{
					if (d==a||d==b||d==c) {
						continue;
					}
					for(e=1;e<10;e++)
					{
						if (e==a||e==b||e==c||e==d) {
							continue;
						}
						A=a*10000+b*1000+c*100+d*10+e;
						C=a+b*10+c*100+d*1000+e*10000;
						if (C%A==0) {
							System.out.println(A+"*"+C/A+"="+C);
						}
						
					}
				}
			}
		}
		
	}
}
}
