package Work3;

public class Reciver extends Thread {
 public int[] cards;
private Card  m_Card;
private int order;

public Reciver(Card card,int order,int count)
 {   this.order=order;
	this.m_Card=card;
	cards=new int[count];

	
	}
public Reciver()
{}
public void show()
{
	System.out.print("Íæ¼Ò"+order+":");
	for (int i = 0; i < cards.length; i++) {
		System.out.print(cards[i]+"  ");
	}
	System.out.println();
	}
 public void run()
 {
	 
	 
	 for(int i=0;i<cards.length;i++)
	 {
		
		try {
			 cards[i]=m_Card.get(this.order);
		      Thread.sleep(100);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 }
	 
	 
 }

}
