package work7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1 {
	//读取文件
	public static String TextRead(String filename)
	{
		FileInputStream fis=null;
		StringBuffer sBuffer=new StringBuffer();
	try {
	//文件输入流
		fis=new FileInputStream(new File(filename));
		byte[] buf=new byte[1];
		int len=0;
		while((len=fis.read(buf))>=0)
		{      String string=new String(buf);//把字节行转化为string
		      sBuffer.append(string);		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//返回string
	return sBuffer.toString();
}
	public static void Compare(String text1,String text2)
	{
		
		char[] mText1=text1.toCharArray();
		char[] mText2=text2.toCharArray();
		System.out.println(text1.length());
		System.out.println(text2.length());
		//从第一个开始与text2比较
		for(int i=0;i<mText1.length-21;i++)
		{ 
			int start=0;//寻找的数量
			int  flag=i;//寻找的标记
			String string=new String();//相同的文字
			for(int j=0;j<mText2.length;j++)
			{
 //寻找到了一样的 数量跟标记值都变
				if (mText1[flag]==mText2[j]) {
					string+=mText1[flag];
				    start++;
				    flag++;
					if (start>=20){
						System.out.print("貌试抄袭");
                         System.out.print(string);
                         System.out.print("  "+i+"  "+(j-19));
                         System.out.println();
                         start=0;
     					 i=flag;//i变成到寻找截止位置
     					string=new String();
                       break;
					}
				}
				//没有找到 数量变为0 标记值变为i
				else {
					start=0;
					flag=i;
					string=new String();
				}
				
			}
		}
		
	}

	public static void main(String[] args) {
	    String text1name=new String("D:\\JavaCode\\Work\\src\\work7\\text.txt");
	    String text2name=new String("D:\\JavaCode\\Work\\src\\work7\\text1.txt");
        String mText1 = TextRead(text1name);
	    String mText2=TextRead(text2name);
	    System.out.println(mText1);
	    System.out.println(mText2) ;
	  Compare(mText1, mText2);
	    
	}
	
	

}
