package Work6Stack;
import java.util.*;

public class Test {
	public static void PrintStack(Stack s)
	{
		while(!s.isEmpty())
		{
			System.out.print(s.pop());
		}
		System.out.println();
		
	}
	//10进制转2进制
		public static void TenToTwo(Stack s,int num)
		{
	     if (num==0) {
				return ;
			}
	     if (num==1) {
			s.push(num%2);
			return;
		}
	     
   s.push(num%2);//把对2取余的数加入栈
   TenToTwo(s,num/2);//除2
		}
		//10转16进制
		public static void TenToSixteen(Stack s,int num)
		{
			if (num==0) {
				return;
			}
			//除16然后对16取余 
		
			if (num%16>=10) {
				
				switch(num%16)
				{
				    case 10:
					   s.push("A");
					    break;
					case 11:
						   s.push("B");
						break;
					case 12:
						   s.push("C");
							break;
					case 13:
						   s.push("D");
							break;
					case 14:
						   s.push("E");
							break;
					case 15:
						   s.push("F");
							break;
							
				}
				
			}
			else {
			
				   s.push(num%16);
			}
			
				TenToSixteen(s,num/16);//除16
		}
		//10进制转8
		public static void TenToEight(Stack s,int num)
		{
			if (num==0) {
				 return;
			}
			//除8然后对8取余
			
			s.push(num%8);
			TenToEight(s,num/8);
		}
		//输入10进制数num 还有需要转化的进制 condition
		public static void Conversion(Stack s,int num,int condition)
		{
			System.out.println("您输入的是"+num );
			switch(condition)
			{
			case 8:
				System.out.println("转化成八进制为");
				
				TenToEight(s,num);
				System.out.println();
				break;
		   case 2:
			   System.out.println("转化成二进制为");
			   TenToTwo(s,num);
		  System.out.println();
			    break;
		   case 16 :
			   System.out.println("转化成十六进制为");
		
			   TenToSixteen(s,num);
			   System.out.println();
		        break;
		   default :
			   System.out.println("输入的转化进制数"+condition+"错误应该是10  2 16中的一个");
			break;
			}
		}
		public static boolean Judge(ArrayList<String> s,Stack stack ,int sLlen) {
			
			System.out.println(sLlen);
		
           int iLen=stack.size();		
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
			//判断最后一个括号是不是[(
			if (s.get(sLlen-1).equals("(")||s.get(sLlen-1).equals("[")) {
				System.out.println("最后一个括号是(]");
				return false;
			}
			//从最急切的一个数开始匹配
		while(!stack.isEmpty())//判断栈空
		{
			int pri=(int )stack.pop();
			//匹配最急切数后面的数
			for(int j=pri;j<s.size();j++)
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
		public static void putchar(String s, Stack stack)
		{  
			int end=s.length()-1;
			for(int i=0;i<=end;i++)
			{ 
				//往栈中加入元素
				stack.push(s.substring(i, i+1));
				
				if (stack.peek().equals("@")){//如果出现@清空栈
					
				    stack=new Stack();
				    continue;
				}
				if (stack.peek().equals("#")) {//如果出现##删除栈顶及下一个
					if (stack.size()>1) {
						stack.pop();
						stack.pop();
					}
					else {
						stack.pop();
					}
				}
			}
			Stack stack2=new Stack();
			while (!stack.isEmpty())
			{
				//返回原先字符的顺序
				stack2.push(stack.pop());
			}
			PrintStack(stack2);
			
		}
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			//第一题
		Stack s=new Stack();
		Conversion(s, 100, 2);//转换
		PrintStack(s);//打印栈
		Conversion(s, 8, 8);
		PrintStack(s);
		Conversion(s, 16, 16);
		PrintStack(s);
			//第二题
			/*   boolean istrue=true;
			  Stack stack=new Stack();
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
						 stack.push(i);
						}
						i++;
					}
				}
				while(!s.equals("n"));
				for(int k=0;k<i;k++)
				{
					System.out.print(mStrings.get(k));
				}
				istrue=Judge(mStrings, stack,i);
			   if (istrue) {
				   System.out.println("匹配");
				
			}
			 else {
				System.out.println("不匹配");
			}*/
			//第三题
			/*Stack s=new Stack();
			System.out.println("请输入一行字符");
	        String string=input.next();   
	        putchar(string,s);*/
			

		}

}
