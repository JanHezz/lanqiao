package work7;

import java.util.Scanner;
import java.util.Stack;

public class Test2 {
	//��s����ջ Ȼ���������෴��ջȥ�Ƚ�a
	public static boolean Judge(String s)
	{  //��ջ���������
		Stack stack=new Stack();
		int end=s.length()-2;
		for(int i=0;i<=end;i++)
		{ 
			//��ջ�м���Ԫ��
			stack.push(s.substring(i, i+1));
		}
        //����һ���෴��ջ
		Stack stack2=new Stack();
		for(int i=end;i>=0;i--)
		{ 
			//��ջ�м���Ԫ��
			stack2.push(stack.get(i));
		}

		return Compare(stack, stack2);
		
	}
	//�Ƚ�����ջ�Ƿ�һ��
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
	//�ж��Ƿ��ǻ���
	public static boolean junge(String  a)
	{
		if (a.length()==0||a.length()==1) {//������0ʱ����true
			return true ;
		}
		if (a.charAt(0)==a.charAt(a.length()-1)) {//��β��ͬ
		     return   junge(a.substring(1, a.length()-1));//��ȥ��β	
		}
		else {
			return false;
		}
		
		
	}
public static void main(String[] args) {
	/*Scanner input=new Scanner(System.in);
	String mString=new String();
	System.out.println("������һ���ַ���@����");
	mString=input.next();
	if (Judge(mString)) {
		System.out.println("�ǻ���");
	}
	else {
		System.out.println("���ǻ���");
	}*/
	
}
}
