package Zt2;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		  Scanner input=new Scanner(System.in);
		  System.out.println("������n��ֵ");
		 int n=input.nextInt();
		 
		
		 int [] nums=new int[n];
		 for (int i = 0; i <n; i++) {//�����ֻ�β��
			 input=new Scanner(System.in);
			 nums[i]=input.nextInt();
		}
		 for (int i = 0; i < nums.length; i++) {//��β������
			   int score=0;
			   int num=nums[i];
			  int Sz[]=new int[4];//������ÿ��λ�õ�����
			  int q=num/1000;
			  Sz[0]=q;
			  int b=(num/100)%10;
			  Sz[1]=b;
			  int s=(num/10)%10;
			  Sz[2]=s;
			  int g=num%10;
			  Sz[3]=g;
			  if ((q+1==b&&b+1==s&&s+1==g)||(q-1==b&&b-1==s&&s-1==g)) {//��˳��
				score+=5;
			}
			else if (num%1111==0){//�����ĸ�����һ��
				score+=8;
			}
			 else if ((num/10)%111==0||num%1000%111==0){//����AAAb||abbb
				score+=3;
			}
			 else if(q*10+b==s*10+g||q==b&&s==g){//aabb||abab
				score+=1;
			}
			for(int j=0;j<Sz.length;j++)//�ж��Ƿ���689
			{
				if (Sz[j]==6||Sz[j]==8||Sz[j]==9) {
					score+=1;
				}
			}
			
			 
			 System.out.println(score);
		 }
		
	}

  
}
