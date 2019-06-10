package Zt6;

import java.util.Vector;

public class Test2 {
	public static int count;
	public static void AllType(Vector<Character> sourse,Vector<Character>result) {
		if(sourse.size()==0){
			//System.out.println(result);
			int a=(result.elementAt(0)-'0')*100+(result.elementAt(1)-'0')*10+result.elementAt(2)-'0';
			int b=(result.elementAt(3)-'0')*100+(result.elementAt(4)-'0')*10+result.elementAt(5)-'0';
			int c=(result.elementAt(6)-'0')*100+(result.elementAt(7)-'0')*10+result.elementAt(8)-'0';
			if(a+b==c){
				System.out.printf("%d + %d = %d\n",a,b,c);
				count++;
			}
		}else{
			for (int i = 0; i < sourse.size(); i++) {
				result.add(sourse.elementAt(i));
				sourse.remove(i);
				AllType(sourse, result);
				sourse.add(i, result.elementAt(result.size()-1));
				result.remove(result.size()-1);
			}
		}
	}
	public static void main(String[] args) {
		Vector<Character>sourse=new Vector<Character>();
		Vector<Character>result=new Vector<Character>();
		for (int i = 1; i <= 9; i++) {
			sourse.add((char)('0'+i));
		}
		AllType(sourse, result);
		System.out.println(count);
	}


}
