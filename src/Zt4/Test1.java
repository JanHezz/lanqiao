package Zt4;

public class Test1 {
	public static int getFirstNum(String s) {
		if (s == null || s.length() == 0)
			return -1;
		char c = s.charAt(0);
		if (c >= '0'&& c <= '9')
			return (int)(c-'0'); // 填空
			

	    return getFirstNum(s.substring(1));           // 填空
	}
	public static void main(String[] args) {
		String s1 = "abc24us43";  //则返回2
		String s2 = "82445adb5";  //则返回8
		String s3 = "ab";	//则返回-1   
		System.out.println(getFirstNum(s1));
		System.out.println(getFirstNum(s2));
		System.out.println(getFirstNum(s3));
	}


}
