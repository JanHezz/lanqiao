package Work3;

public class Sender extends Thread {
 private Card m_Card;
 private int count;
 public Sender(Card card,int count)
 {
	 this.m_Card=card;
	 this.count=count;
 }
 public void run()
 {
	for(int i=0;i<count;i++)
	{
		m_Card.put(i);
		
	}
	 
 }
	
}
