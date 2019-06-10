package Zt9;

import java.util.Random;

public class Test1 {
   static int [] dice=new int[3];
   static long money=0;
  static Random random=new Random();
	public static void Began(int i)
	{
		Random random=new Random();
		dice[0]=random.nextInt(6)+1;
		dice[1]=random.nextInt(6)+1;
		dice[2]=random.nextInt(6)+1;
		if (i==dice[0]&&i==dice[1]&&i==dice[2]) {
			money-=6;
		}
		else if (i==dice[0]&&i==dice[1]||i==dice[1]&&i==dice[2]||i==dice[0]&&i==dice[2]) {
			money-=2;
		}
		else if (i==dice[0]||i==dice[1]||i==dice[2]){
			money-=1;
		}
		else if (i*dice[0]==dice[1]*dice[2]||i*dice[1]==dice[0]*dice[2]||i*dice[2]==dice[1]*dice[0]) {
			
		}
		else {
			money+=1;
		}
		
	}
public static void main(String[] args) {
	
	for(int i=1;i<=500000;i++)
	{
		Began(random.nextInt(6)+1);
		
	}
	System.out.println(String.format("%.3f", (money)/500000.0));
}
}
