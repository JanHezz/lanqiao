package ZT10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {

	/*
	 * 
	 * zhangfeng
wangximing
jiujingfazi
woaibeijingtiananmen
haohaoxuexi

	 * 
	 * */
	
	public static void Convert(List<char[]> list)//ת��
	{
		int a[]=new int[6];
		for(int i=0;i<list.size();i++)
		{
			char[] c=list.get(i);
			for(int j=0;j<c.length;j++)
			{
				a[j]+=c[j];//�Ѷ�Ӧ�е�asallֵ������
				
			}
			
		}
		Calculate(a);
	}
	public static void Calculate(int [] a)//����
	{
		for (int i = 0; i < a.length; i++) {
			while(a[i]>=10)//����10�ͷֽ�
			{
				if (a[i]>100) {
					int a1=a[i]/100;
					int b1=a[i]/10%10;
					int c1=a[i]%10;
					a[i]=a1+c1+b1;
				}
				else {
					int a1=a[i]/10;
					int b1=a[i]%10;
					 a[i]=a1+b1;
				}
				
			}
		System.out.print(a[i]+" ");
	}
		System.out.println();
	}
	
	public static void main(String[] args) {	
		List<String> mResouce=new ArrayList<String>();
		Scanner input=new Scanner(System.in);
	    int n=input.nextInt();
	    while(n-->0) //����
	    {
	    	input=new Scanner(System.in);
	    	String s1=input.nextLine();
	    	mResouce.add(s1);
	    	
	    }
	   
	   for (String s : mResouce) {//��string��sת��Ϊ��Ӧ���ַ�����
		   List<char[]> list=new ArrayList<char[]>();
		   while(s.length()>0)
			{
				if (s.length()>6)
				{
			String  s1=s.substring(0, 6);
			 s=s.substring(6);
			char[] a=s1.toCharArray();
			list.add(a);
				}
				else {
					char[] a=s.toCharArray();
					list.add(a);
					s="";
				}
				
			}
		   Convert(list);//ת����ascll��
	}
		
	}

}
