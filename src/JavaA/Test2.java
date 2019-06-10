package JavaA;

public class Test2 {
   public static void main(String[] args) {
	int year=2014;
	int mon=11;
	int day=9;
	int num=1000;
	
	int[] month=new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
/*	while(num>0)
	{
		if(month[mon-1]-day<num) {
			
			num=num-(month[mon-1]-day+1);
		day=1; mon++; 
		if(mon>12) {
			year++; mon=1; 
		if((year%4==0&&year%100!=0)||year%400==0)
		 { month[1]=29; } else month[1]=28;
		  } 
		 } else 
		 { 
			day = num + day; num=0; }

		
	}
	System.out.println(year+"-"+mon+"-"+day);*/
	while(num>0)
	{
		if (num>month[mon-1]-day) {
			num-=(month[mon-1]-day+1);
			day=1;
			mon++;
			if (mon>12) {
				mon=1;
				year++;
				if (year%4==0&&year%100!=0||year%400==0) {
				month[1]=29;
			   }
			else {
				month[1]=28;
			}
			}
		}
		else {
			day+=num;
			break;
		}
		
	}
	System.out.println(year+" "+mon+" "+day);
}
}
