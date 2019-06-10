package Practice;

import javax.swing.plaf.TreeUI;

public class Test24 {
	public static void main(String[] args) {
	
		int month=10;
		int day=0;
		int week=5;
		int Wday=31;
		for( int i=1949;i<=2012;i++)
		{  boolean isyear=true;
			while(isyear)
			{
				if (month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
					Wday=31;
	
				}
				else {
					Wday=30;
				}
				
				if (month==2) {
					 if (i%4==0&&i%100!=0||i%400==0) {
							Wday=29;
						}
					 else {
						Wday=28;
					}
				}
				for( int j=1;j<=Wday;j++)
				{
					    week++;
					if (week>7) {
						week=1;
					}
				 
					if (j==1&&month==10&&week==7) {
						day++;
					}
				}
				month++;
				
				if (month>12) {
					month=1;
					isyear=false;
				}
			}

		}
	System.out.println(day);	
	}

}
