package Practice;

public class Test18 {
	public static void main(String[] args) {
		int sum=236;
	    boolean isfind=false;
        for(int i=1;i<100;i++)
        {  int jisun=0;

        	for(int j=i;j<100;j++)
        	{
        		jisun+=j;
        		if (jisun==sum) {
					System.out.println(i);
					isfind=true;
					break;
				}
        		if (jisun>sum) {
					break;
				}
        	}
        	if (isfind) {
				break;
			}
        }
	}

}
