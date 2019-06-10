package Practice;

public class Test7 {
	public static void stringInGrid(int width, int height, String s)
	{
		if(s.length()>width-2) s = s.substring(0,width-2);
		System.out.print("+");
		for(int i=0;i<width-2;i++) System.out.print("-");
		System.out.println("+");
		
		for(int k=1; k<(height-1)/2;k++){
			System.out.print("|");
			for(int i=0;i<width-2;i++) System.out.print(" ");
			System.out.println("|");
		}
		
		System.out.print("|");
		
		String ff ="%"+(width-s.length()-2)/2+"s%s%"+((width-s.length()-2)/2)+"s"; //МоїХ


		System.out.print(String.format(ff,"",s,""));
		
		
		          
		System.out.println("|");
		
		for(int k=(height-1)/2+1; k<height-1; k++){
			System.out.print("|");
			for(int i=0;i<width-2;i++) System.out.print(" ");
			System.out.println("|");
		}	
		
		System.out.print("+");
		for(int i=0;i<width-2;i++) System.out.print("-");
		System.out.println("+");	
	}
	public static void main(String[] args) {
		stringInGrid(20,6,"abc1234");
		System.out.println(String.format("%10s", "dsadas"));
	}

}
