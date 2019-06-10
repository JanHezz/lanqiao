package Zt5;

import java.util.ArrayList;

public class Test3 {
	public static void main(String[] args) {
		int x,y,sum,count;
         count=0;
			for(int i=1;i<10;i++)
			{
				for(int j=1;j<10;j++)
				{ if (j==i) {
					continue;
				            }
					for(int a=1;a<10;a++)
					{
						if (a==i||a==j) {
							continue;
						  }
						x=i*100+j*10+a;
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
									 y=b*100+c*10+d;
								
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
												sum=e*100+f*10+g;
												if (x+y==sum){
													count++;
													System.out.println(x+"+"+y+"="+sum);
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
			System.out.println(count);
	}

}
