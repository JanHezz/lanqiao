package Test1;

public class Test2 {
	public static void main(String[] args) {
		int all=30000;
		double lilv=0.005f;
		int month=1250;
		double huan=(all-1250*14)*lilv+1250;
		System.out.println(huan);
		System.out.println(String.format("%.1f", huan));
	}

}
