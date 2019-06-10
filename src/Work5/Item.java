package Work5;

public class Item implements Comparable<Item>{
	public int coefficient;
	public int power;
	public Item()
	{
		
	}
	
	public Item(int coefficient, int power) {
		super();
		this.coefficient = coefficient;
		this.power = power;
	}

	@Override
	public String toString() {
		if (power==0) {
		return  coefficient+"";
		}
		else {
			return  coefficient+"X"+"x^"+ power;
		}
		
	}

	@Override
	public int compareTo(Item o) {
		// TODO Auto-generated method stub
		
		return this.power-o.power;
	}


}
