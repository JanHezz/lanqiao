package Zt1;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
	int x,y,x1,y1;
	ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<10;i++)
		{
			for(int j=1;j<10;j++)
			{ if (j==i) {
				continue;
			}
			x=i*10+j;
				for(int a=1;a<10;a++)
				{
					if (a==i||a==j) {
						continue;
					}
					for(int b=1;b<10;b++)
					{
					
						if (b==i||b==j||b==a) {
							continue;
						}
						y=a*10+b;
						
						for(int c=1;c<10;c++)
						{
							if (c==i||c==j||c==a||c==b) {
								continue;
							}
							for(int d=1;d<10;d++)
							{
							
								if (d==i||d==j||d==a||d==b||d==c) {
								continue;
							}
								 x1=c*10+d;
							
								for(int e=1;e<10;e++)
								{
									if (e==i||e==j||e==a||e==b||e==c||e==d) {
										continue;
									}
									for(int f=1;f<10;f++)
									{
										if (f==i||f==j||f==a||f==b||f==c||f==d||f==e) {
											continue;
										}
										for(int g=1;g<10;g++)
										{
											if (g==i||g==j||g==a||g==b||g==c||g==d||g==e||g==f) {
												continue;
											}
											y1=e*100+f*10+g;
											if (x*y==x1*y1){
												list.add(y);
												if (list.contains(x)) {
													continue;
												}
												System.out.println(x+"*"+y+"="+x1+"*"+y1);
											}
											
										}
									}	
								}
							}	
						}
					}
				}
			}
			
		}
	}

}
