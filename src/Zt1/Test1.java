package Zt1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
	public static String Deal(String s)
	{
		//[\\s]+������ʽ��ʾ�ո� ���ֶ�λ�һ��
		String[] mArray=s.split("[\\s]+");//�Կո�Ϊ��ֳ�����
		String mString=new String();
		System.out.println(mArray.length);
		for (int i = 0; i <mArray.length; i++) {
			StringBuffer sb=new StringBuffer(mArray[i]);
			String up=(mArray[i].charAt(0)+"").toUpperCase();//
			mArray[i]=sb.replace(0, 1, up).toString();
			//[\\d]+������ʽ��ʾ���� ���ֶ�λ�һ��
			 Matcher m = Pattern.compile("[\\d]+").matcher(mArray[i]);  //����ģʽʵ��
	            while(m.find()){  //ƥ�䵽��
	                String num1= new String(m.group());  //ȡ��ƥ����ַ���
	                String num2 = num1;  
	                num2 = "_"+num1+"_";     // ����ǰ���"_"  
	                mArray[i] = mArray[i].replace(num1, num2);  
	                if(mArray[i].startsWith("_")){  // ��ͷ��_ȥ��
	                    mArray[i] = mArray[i].substring(1);  
	                }  
	                if(mArray[i].endsWith("_")){    //��β��_ȥ�� 
	                    mArray[i] = mArray[i].substring(0, mArray[i].length()-1); 
	                }  
	            }
	            mString+=mArray[i]+" ";
		}
		
		return mString;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s=new String();
		System.out.println("������һ���ַ���(����֮���ÿո����)");
	    s=input.nextLine();
	    s=Deal(s);
	    System.out.println(s);
	}

}
