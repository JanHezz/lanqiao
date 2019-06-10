package Work3;

public class TestSenderPoker {
public static void main(String[] args) throws InterruptedException {
	Reciver thread[] =new Reciver[4];
	Card m_Card=new Card();
	Sender m_Sender=new Sender(m_Card, 100);
	m_Sender.setPriority(10);
	m_Sender.start();
	for(int i=0;i<thread.length;i++)
	{
	thread[i]=new Reciver(m_Card,i, 100/4);
	thread[i].start();
	}	
	for(int i=0;i<thread.length;i++)
	{
	thread[i].join();
	}	
	for(int i=0;i<thread.length;i++)
	{

	thread[i].show();
	}	

	
	
	
	
}
}
