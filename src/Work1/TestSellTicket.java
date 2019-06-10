package Work1;

public class TestSellTicket {
public static void main(String[] args) throws Exception {
	TicketsRunnable ticket=new TicketsRunnable();
	Thread t1=new Thread(ticket);
	t1.setName("窗口1");
	t1.start();
	Thread t2=new Thread(ticket);
	t2.setName("窗口2");
	
	t2.start();
	Thread t3=new Thread(ticket);
	t3.setName("窗口3");

	t3.start();
	Thread t4=new Thread(ticket);
	t4.setName("窗口4");

	t4.start();
}
}
