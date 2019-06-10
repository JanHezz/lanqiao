package Work1;

public class MyRunable implements Runnable {
public int count=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		count++;
	System.out.println("MyRunanble"+":"+count);
	}
	

}
