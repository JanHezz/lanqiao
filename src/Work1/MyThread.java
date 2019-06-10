package Work1;

public class MyThread extends Thread {
	public int count=0;
	public void  run() {

		count++;
	System.out.println("MyThread"+" :"+count);
	}


}
