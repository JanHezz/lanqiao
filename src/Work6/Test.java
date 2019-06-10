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
	//10进制转2进制
	public static void TenToTwo(int num)
	{
     if (num==0) {
			return ;
		}
     if (num==1) {
		System.out.print(1%2);
		return;
	}
     //除2然后对2取余
     TenToTwo(num/2);
     
   
	 System.out.print(num%2);		

	 


	 
	
 	
	}
	//10转16进制
	public static void TenToSixteen(int num)
	{
		if (num==0) {
			return;
		}
		//除16然后对16取余
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
	//10进制转8
	public static void TenToEight(int num)
	{
		if (num==0) {
			 return;
		}
		//除8然后对8取余
		TenToEight(num/8);
		System.out.print(num%8);
	}
	//输入10进制数num 还有需要转化的进制 condition
	public static void Conversion(int num,int condition)
	{
		System.out.println("您输入的是"+num );
		switch(condition)
		{
		case 8:
			System.out.println("转化成八进制为");
			
			TenToEight(num);
			System.out.println();
			break;
	   case 2:
		   System.out.println("转化成十进制为");
		
		   TenToTwo(num);
	  System.out.println();
		    break;
	   case 16 :
		   System.out.println("转化成十六进制为");
	
		   TenToSixteen(num);
		   System.out.println();
	        break;
	   default :
		   System.out.println("输入的转化进制数"+condition+"错误应该是10  2 16中的一个");
		break;
		}
	}
	//删除数组中从start开始到end之间的字符包括start与end
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
	//放入字符串做判断
	public static void putchar(String s)
	{
		int end=s.length()-1;
		//从后开始便厉判断是否存在@存在就删除前面所有字符；并跳出循环
		for(int i=end;i>=0;i--)
		{ 
			if (s.substring(i, i+1).equals("@")) {
			s=Delete(s, 0, i);
				break;
			}
		}
		//从前开始便利出现#后删除自己以及前一位
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
				//当#号出现在第一位时删除自己i--
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
	//判断输入的括号是否匹配 
	/*s为集合
	 * prio[] 为优先级数组
	 * slen 为集合的长度
	 * ilen 为优先数组的长度
	 * 
	 */
	public static boolean Judge(ArrayList<String> s,int prio[],int sLlen,int iLen) {
		
		System.out.println(sLlen);
		System.out.println(iLen);
	
		//判断整的括号是不是偶数
		if (sLlen%2!=0) {
			System.out.println("不是偶数");
			return  false;
		}
		//判断输入([的数量是不是整个数组的一半
		if (iLen!=sLlen/2) {
			System.out.println("不是一半");
			return false;
		}
		//判断第一个括号是不是)]
		if (s.get(0).equals("]")||s.get(0).equals(")")){
			System.out.println("第一个括号是](");
			return false;
		}
		//判断第一个括号是不是[(
		if (s.get(sLlen-1).equals("(")||s.get(sLlen-1).equals("[")) {
			System.out.println("最后一个括号是(]");
			return false;
		}
		//从最急切的一个数开始匹配
	for(int i=iLen-1;i>=0;i--)
	{
		int pri=prio[i];
		//匹配最急切数后面的数
		for(int j=prio[i];j<s.size();j++)
		{
			if (s.get(pri).equals("("))
			{
				if (s.get(pri+1).equals("]")) {
					return false;
				}
				//匹配到了移除该匹配的括号退出该次循环
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
	
//第一题	
	/*Conversion(100, 2);
	Conversion(100, 16);
	Conversion(100, 8);*/
  
   Scanner input=new Scanner(System.in);

/*	//第三题
   String s,s1;
   s=new String("wh@il##ilre#(s#*S)"); 
   s1=new String("outcha@putcahr(*s=#++)"); 
   System.out.println(s);
   System.out.println(s1);
putchar(s);
putchar(s1);
 */
   //第二题
  /*  boolean istrue=true;
   int [] prio=new int[10];

	ArrayList<String> mStrings=new ArrayList<String>();
	String s=new String();
	int i=0;
	int j=0;
	do 
	{
		
		System.out.println("请输入大括号小括号或者以n结束");
		s=input.next();
		if (!s.equals("n")) {
			mStrings.add(s);
			//如果为（[加入优先级
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
	   System.out.println("匹配");
	
}
 else {
	System.out.println("不匹配");
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
