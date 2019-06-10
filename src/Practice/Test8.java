package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Test8 {
	public static void main(String[] args) {
		long pi;
		long li;
	
	
		for(long i=1;;i++)
		{
			boolean isfind=false;
			
			pi=(long)Math.pow(i, 2);
		    li=(long)Math.pow(i, 3);
		  String p=new String(pi+"");
		  String l=new String(li+"");
		  if (p.length()+l.length()!=10) {
			continue;
		  }
		  //12340
		  //56789
		char c[]=(p+l).toCharArray();
Arrays.sort(c);
    String string=new String(c);
      if (string.equals("0123456789")) {
	  isfind=true;
       }
		if (isfind) {
			System.out.println(i);
			System.out.println(pi);
			System.out.println(li);
			break;
		}
		  }
			
		}
		
		
	}


