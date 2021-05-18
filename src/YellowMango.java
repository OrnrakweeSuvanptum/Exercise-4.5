
public class YellowMango extends Mango {
	
	private String taste;
	private String types;
	
	
	public YellowMango(String name, double p, int q, String t, String types) {
		super(name, p, q);
		this.taste = t; 
		this.types = types; 
		
	}
	public String getTaste() {
		return this.taste;
	}
	
	public String getTypes() {
		return this.types;
	}
	
	Discount a = new YellowMangoDiscount(); //create new object for Yellow Mango Discount
	
	public double calPrice() {
		return (super.totalPrice()-(super.totalPrice()*a.discount()));
	}

	
	public String toString() {
		return ("Total Price: RM" + paid + "\n"
				+ "Taste of " + super.name + " is " + getTaste() + "\n"
				+ "Types of " + super.name + " is " + getTypes() + "\n"
				+ "Price after discount: RM" + calPrice());
				
	}

}
