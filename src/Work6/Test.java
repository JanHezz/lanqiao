package Work6;

import java.awt.TexturePaint;
import java.awt.datatransfer.FlavorListener;
import java.io.Console;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;
import javax.swing.text.StyledEditorKit.BoldAction;

public class Test {
	//10����ת2����
	public static void TenToTwo(int num)
	{
     if (num==0) {
			return ;
		}
     if (num==1) {
		System.out.print(1%2);
		return;
	}
     //��2Ȼ���2ȡ��
     TenToTwo(num/2);
     
   
	 System.out.print(num%2);		

	 


	 
	
 	
	}
	//10ת16����
	public static void TenToSixteen(int num)
	{
		if (num==0) {
			return;
		}
		//��16Ȼ���16ȡ��
		TenToSixteen(num/16);
		if (num%16>=10) {
			
			switch(num%16)
			{
			    case 10:
				    System.out.print("A");
				    break;
				case 11:
					System.out.print("B");
					break;
				case 12:
						System.out.print("C");
						break;
				case 13:
						System.out.print("D");
						break;
				case 14:
						System.out.print("E");
						break;
				case 15:
						System.out.print("F");
						break;
						
			}
			
		}
		else {
		
			System.out.print(num%16);
		}
		
		
	}
	//10����ת8
	public static void TenToEight(int num)
	{
		if (num==0) {
			 return;
		}
		//��8Ȼ���8ȡ��
		TenToEight(num/8);
		System.out.print(num%8);
	}
	//����10������num ������Ҫת���Ľ��� condition
	public static void Conversion(int num,int condition)
	{
		System.out.println("���������"+num );
		switch(condition)
		{
		case 8:
			System.out.println("ת���ɰ˽���Ϊ");
			
			TenToEight(num);
			System.out.println();
			break;
	   case 2:
		   System.out.println("ת����ʮ����Ϊ");
		
		   TenToTwo(num);
	  System.out.println();
		    break;
	   case 16 :
		   System.out.println("ת����ʮ������Ϊ");
	
		   TenToSixteen(num);
		   System.out.println();
	        break;
	   default :
		   System.out.println("�����ת��������"+condition+"����Ӧ����10  2 16�е�һ��");
		break;
		}
	}
	//ɾ�������д�start��ʼ��end֮����ַ�����start��end
	public static String Delete(String s,int start, int end)
	{
	
		String mString=new String();
		for(int i=0;i<start;i++)
		{
			mString+=s.substring(i, i+1);
		}
		for(int i=end+1;i<s.length();i++)
		{
			
			
			mString+=s.substring(i, i+1);
		}
		return s=mString;
		
	}
	//�����ַ������ж�
	public static void putchar(String s)
	{
		int end=s.length()-1;
		//�Ӻ�ʼ�����ж��Ƿ����@���ھ�ɾ��ǰ�������ַ���������ѭ��
		for(int i=end;i>=0;i--)
		{ 
			if (s.substring(i, i+1).equals("@")) {
			s=Delete(s, 0, i);
				break;
			}
		}
		//��ǰ��ʼ��������#��ɾ���Լ��Լ�ǰһλ
		for(int i=0;i<s.length();i++)
		{
			if (i>0)
			{
				if (s.substring(i, i+1).equals("#")) 
				{
			     s=Delete(s, i-1, i);
			     i--;
			     i--;
			    }
			 }
				//��#�ų����ڵ�һλʱɾ���Լ�i--
			if (i==0)
			{
				if (s.substring(i, i+1).equals("#"))
				{
					s=Delete(s, i, i);
					i--;
				}
		    }	
      }
		System.out.println(s);
	}
	//�ж�����������Ƿ�ƥ�� 
	/*sΪ����
	 * prio[] Ϊ���ȼ�����
	 * slen Ϊ���ϵĳ���
	 * ilen Ϊ��������ĳ���
	 * 
	 */
	public static boolean Judge(ArrayList<String> s,int prio[],int sLlen,int iLen) {
		
		System.out.println(sLlen);
		System.out.println(iLen);
	
		//�ж����������ǲ���ż��
		if (sLlen%2!=0) {
			System.out.println("����ż��");
			return  false;
		}
		//�ж�����([�������ǲ������������һ��
		if (iLen!=sLlen/2) {
			System.out.println("����һ��");
			return false;
		}
		//�жϵ�һ�������ǲ���)]
		if (s.get(0).equals("]")||s.get(0).equals(")")){
			System.out.println("��һ��������](");
			return false;
		}
		//�жϵ�һ�������ǲ���[(
		if (s.get(sLlen-1).equals("(")||s.get(sLlen-1).equals("[")) {
			System.out.println("���һ��������(]");
			return false;
		}
		//����е�һ������ʼƥ��
	for(int i=iLen-1;i>=0;i--)
	{
		int pri=prio[i];
		//ƥ��������������
		for(int j=prio[i];j<s.size();j++)
		{
			if (s.get(pri).equals("("))
			{
				if (s.get(pri+1).equals("]")) {
					return false;
				}
				//ƥ�䵽���Ƴ���ƥ��������˳��ô�ѭ��
				if (s.get(j+1).equals(")")) {
					s.remove(j+1);
					s.remove(pri);
				
					break;
				}
				
			}
				
			if (s.get(pri).equals("["))
			{
				if (s.get(pri+1).equals(")")) {
					return false;
				}
				if (s.get(j+1).equals("]")) {
					s.remove(j+1);
					s.remove(pri);
			
					break;
				}
				
			}
		}
		
	}
		return true;
		
	}
	public static void Show(int [] [] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
public static void main(String[] args) {
	
//��һ��	
	/*Conversion(100, 2);
	Conversion(100, 16);
	Conversion(100, 8);*/
  
   Scanner input=new Scanner(System.in);

/*	//������
   String s,s1;
   s=new String("wh@il##ilre#(s#*S)"); 
   s1=new String("outcha@putcahr(*s=#++)"); 
   System.out.println(s);
   System.out.println(s1);
putchar(s);
putchar(s1);
 */
   //�ڶ���
  /*  boolean istrue=true;
   int [] prio=new int[10];

	ArrayList<String> mStrings=new ArrayList<String>();
	String s=new String();
	int i=0;
	int j=0;
	do 
	{
		
		System.out.println("�����������С���Ż�����n����");
		s=input.next();
		if (!s.equals("n")) {
			mStrings.add(s);
			//���Ϊ��[�������ȼ�
			if (s.equals("(")||s.equals("[")) {
			   prio[j]=i;
			   j++;
			}
			i++;
		}
	
	}
	while(!s.equals("n"));
	for(int k=0;k<i;k++)
	{
		System.out.print(mStrings.get(k));
	}
	istrue=Judge(mStrings, prio,i,j);
   if (istrue) {
	   System.out.println("ƥ��");
	
}
 else {
	System.out.println("��ƥ��");
}
  */
	 /*int[][] maze = 
		 {   {1,1,1,1,1,1,1,1,1,1},
             {1,2,0,1,0,0,0,1,0,1},
             {1,0,0,1,0,0,0,1,0,1},
             {1,0,0,0,0,1,1,0,0,1},
             {1,0,1,1,1,0,0,0,0,1},
             {1,0,0,0,1,0,0,0,0,1},
             {1,0,1,0,0,0,0,1,3,1},
             {1,1,1,1,1,1,1,1,1,1}};

	         Show(maze);
	         */
	Maze maze=new Maze();
    maze.InitMaze();
    maze.dfs(1, 1);
     
}

}
