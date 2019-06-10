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
	//10����ת2����
		public static void TenToTwo(Stack s,int num)
		{
	     if (num==0) {
				return ;
			}
	     if (num==1) {
			s.push(num%2);
			return;
		}
	     
   s.push(num%2);//�Ѷ�2ȡ���������ջ
   TenToTwo(s,num/2);//��2
		}
		//10ת16����
		public static void TenToSixteen(Stack s,int num)
		{
			if (num==0) {
				return;
			}
			//��16Ȼ���16ȡ�� 
		
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
			
				TenToSixteen(s,num/16);//��16
		}
		//10����ת8
		public static void TenToEight(Stack s,int num)
		{
			if (num==0) {
				 return;
			}
			//��8Ȼ���8ȡ��
			
			s.push(num%8);
			TenToEight(s,num/8);
		}
		//����10������num ������Ҫת���Ľ��� condition
		public static void Conversion(Stack s,int num,int condition)
		{
			System.out.println("���������"+num );
			switch(condition)
			{
			case 8:
				System.out.println("ת���ɰ˽���Ϊ");
				
				TenToEight(s,num);
				System.out.println();
				break;
		   case 2:
			   System.out.println("ת���ɶ�����Ϊ");
			   TenToTwo(s,num);
		  System.out.println();
			    break;
		   case 16 :
			   System.out.println("ת����ʮ������Ϊ");
		
			   TenToSixteen(s,num);
			   System.out.println();
		        break;
		   default :
			   System.out.println("�����ת��������"+condition+"����Ӧ����10  2 16�е�һ��");
			break;
			}
		}
		public static boolean Judge(ArrayList<String> s,Stack stack ,int sLlen) {
			
			System.out.println(sLlen);
		
           int iLen=stack.size();		
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
			//�ж����һ�������ǲ���[(
			if (s.get(sLlen-1).equals("(")||s.get(sLlen-1).equals("[")) {
				System.out.println("���һ��������(]");
				return false;
			}
			//����е�һ������ʼƥ��
		while(!stack.isEmpty())//�ж�ջ��
		{
			int pri=(int )stack.pop();
			//ƥ��������������
			for(int j=pri;j<s.size();j++)
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
		public static void putchar(String s, Stack stack)
		{  
			int end=s.length()-1;
			for(int i=0;i<=end;i++)
			{ 
				//��ջ�м���Ԫ��
				stack.push(s.substring(i, i+1));
				
				if (stack.peek().equals("@")){//�������@���ջ
					
				    stack=new Stack();
				    continue;
				}
				if (stack.peek().equals("#")) {//�������##ɾ��ջ������һ��
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
				//����ԭ���ַ���˳��
				stack2.push(stack.pop());
			}
			PrintStack(stack2);
			
		}
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			//��һ��
		Stack s=new Stack();
		Conversion(s, 100, 2);//ת��
		PrintStack(s);//��ӡջ
		Conversion(s, 8, 8);
		PrintStack(s);
		Conversion(s, 16, 16);
		PrintStack(s);
			//�ڶ���
			/*   boolean istrue=true;
			  Stack stack=new Stack();
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
				   System.out.println("ƥ��");
				
			}
			 else {
				System.out.println("��ƥ��");
			}*/
			//������
			/*Stack s=new Stack();
			System.out.println("������һ���ַ�");
	        String string=input.next();   
	        putchar(string,s);*/
			

		}

}
