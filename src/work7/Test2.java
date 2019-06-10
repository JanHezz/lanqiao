package work7;

import java.util.Scanner;
import java.util.Stack;

public class Test2 {
	//把s放入栈 然后用两个相反的栈去比较a
	public static boolean Judge(String s)
	{  //往栈中添加数据
		Stack stack=new Stack();
		int end=s.length()-2;
		for(int i=0;i<=end;i++)
		{ 
			//往栈中加入元素
			stack.push(s.substring(i, i+1));
		}
        //复制一个相反的栈
		Stack stack2=new Stack();
		for(int i=end;i>=0;i--)
		{ 
			//往栈中加入元素
			stack2.push(stack.get(i));
		}

		return Compare(stack, stack2);
		
	}
	//比较两个栈是否一样
	public static boolean Compare(Stack stack1,Stack stack2)
	{
		while(!stack1.isEmpty())
		{   
			if (!stack1.pop().equals(stack2.pop())) {
				return false;
			}
		}
		return true;
		
	}
	//判断是否是回文
	public static boolean junge(String  a)
	{
		if (a.length()==0||a.length()==1) {//当等于0时返回true
			return true ;
		}
		if (a.charAt(0)==a.charAt(a.length()-1)) {//首尾相同
		     return   junge(a.substring(1, a.length()-1));//截去首尾	
		}
		else {
			return false;
		}
		
		
	}
public static void main(String[] args) {
	/*Scanner input=new Scanner(System.in);
	String mString=new String();
	System.out.println("请输入一串字符以@结束");
	mString=input.next();
	if (Judge(mString)) {
		System.out.println("是回文");
	}
	else {
		System.out.println("不是回文");
	}*/
	
}
}
