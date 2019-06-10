package Test;import java.awt.PointerInfo;

public class test3 {


static String target="WWW*BBB";
public static char []a=new char[target.length()];
public static String da="";
static int b=1000;
	public static void main(String[]agrs){
	initData();
	run(0);
	System.out.println(b);
	}
	//步数
	public static void run(int temp){
		if (temp>3) {
			return ;
		}
	  da="";
		for (int i = 0; i < a.length; i++) {
			da+=a[i];
		}
		if(target.equals(da)){
			if(temp<b)
				b=temp;
			return;
		}
		int point=getPoint();
		for (int i = 0; i < a.length; i++) {
			if(i!=point&&Math.abs(point-i)<=3){//限定走的步数为1 2 3
				char index=a[i]; 
				a[i]=a[point];
				a[point]=index;
				run(temp+1);
				a[point]=a[i];
				a[i]=index;
			}
		}
	}
	public static int getPoint(){
		int index=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]=='*'){
				index=i;
				break;
			}
		}
		return index;
	}
	//初始化数据
public static void initData(){
	String data="*WWWBBB";
	for (int i = 0; i < a.length; i++) {
		a[i]=data.charAt(i);
	}
}

	
	
}

