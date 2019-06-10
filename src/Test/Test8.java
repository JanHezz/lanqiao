package Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.plaf.TreeUI;

public class Test8 {
	public static String F(String path) throws IOException
	{
		File file=new File(path);
		InputStream in=new FileInputStream(file);
		StringBuffer sBuffer=new StringBuffer();
		int length=0;
		byte[] data=new byte[1024];
		while((length=in.read(data))!=0)
		{
			sBuffer.append(new String(data));
		}
		return sBuffer.toString();
		
	}
	public static String IsExit(String a,String b)
	{
		char [] Ac=a.toCharArray();
		char [] Bc=b.toCharArray();
		String thesame="";
		for(int i=0;i<Ac.length;i++)
		{
			for(int j=0;j<Bc.length;j++)
			{
				if (Ac[i]==Bc[j]) {
					thesame+=Ac[i];
				}
			}
			
		}
		System.out.println(thesame);
		return thesame;
		
	}
	public static int Compare(String c,String same)
	{char [] Cc=c.toCharArray();
	 char [] Thesame=same.toCharArray();
	 int length=0;
	 for(int i=0;i<Thesame.length;i++)
	 { boolean cunzai=false;
		 for(int j=0;j<Cc.length;j++)
		 {
			 if (Cc[j]==Thesame[i]) {
				cunzai=true;
			}
			 
		 }
		 if (!cunzai) {
			length++;
		}
	 }
	 return length;
		
	}
	public static void main(String[] args) {
		
		String a="124";
		String b="1245";
		String c="1256";
		System.out.println(Compare(c, IsExit(a, b)));
		
	}

}
