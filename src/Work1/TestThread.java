package Work1;

public class TestThread {
	public static void main(String[] args) throws Exception {
		MyThread t1=new MyThread();
		t1.sleep(1000);
		t1.start();
		
		MyThread t2=new MyThread();
		t2.sleep(1000);
		
		t2.start();
		MyThread t3=new MyThread();
		t3.sleep(1000);
		t3.start();
		MyRunable r1=new MyRunable();
		Thread tr1=new Thread(r1);
	tr1.sleep(1000);
	tr1.start();
		Thread tr2=new Thread(r1);
	tr2.sleep(1000);
	tr2.start();
		Thread tr3=new Thread(r1);
		tr3.sleep(1000);
      tr3.start();		
	}

}
