package Work3;



public class Card {
	private int [] m_cards;
	private boolean isEmpty=true;
	private int value;
private int order=0;
	public Card()
	{
		SetCards();
	}
	public void SetCards()//≥ı ºªØ≈∆
	{
		m_cards=new int[100];
		for(int i=0;i<m_cards.length;i++)
		{
			m_cards[i]=i;
		}
	}
	 synchronized void put(int i)
	{
	
		while(!isEmpty)	{
	try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		}
		value=m_cards[i];
		System.out.println("ÕÊº“"+order+" "+value);
		isEmpty=false;
	    notifyAll();
	
	}
	 synchronized int get(int order)
	{
		
	while(isEmpty||(this.order!=order)) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

		isEmpty=true;
		notifyAll();
		this.order=(this.order+1)%4;
	//	System.out.println(order);
	//	System.out.println(value);
		return value;
	}

}
