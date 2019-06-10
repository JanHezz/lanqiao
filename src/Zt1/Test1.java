package Zt1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
	public static String Deal(String s)
	{
		//[\\s]+正则表达式表示空格 出现多次或一次
		String[] mArray=s.split("[\\s]+");//以空格为界分成数组
		String mString=new String();
		System.out.println(mArray.length);
		for (int i = 0; i <mArray.length; i++) {
			StringBuffer sb=new StringBuffer(mArray[i]);
			String up=(mArray[i].charAt(0)+"").toUpperCase();//
			mArray[i]=sb.replace(0, 1, up).toString();
			//[\\d]+正则表达式表示数字 出现多次或一次
			 Matcher m = Pattern.compile("[\\d]+").matcher(mArray[i]);  //创建模式实例
	            while(m.find()){  //匹配到了
	                String num1= new String(m.group());  //取出匹配的字符串
	                String num2 = num1;  
	                num2 = "_"+num1+"_";     // 数字前添加"_"  
	                mArray[i] = mArray[i].replace(num1, num2);  
	                if(mArray[i].startsWith("_")){  // 开头的_去掉
	                    mArray[i] = mArray[i].substring(1);  
	                }  
	                if(mArray[i].endsWith("_")){    //结尾的_去掉 
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
		System.out.println("请输入一行字符串(单词之间用空格隔开)");
	    s=input.nextLine();
	    s=Deal(s);
	    System.out.println(s);
	}

}
