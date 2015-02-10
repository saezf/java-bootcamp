
package t1;


public class Item implements ListableItem{
	
private  double price;
private String name;



public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


public String toString() {

	return String.format("%-50s%.2f", name,price);

}


public  Item(){
	throw new IllegalArgumentException("Must give name, and price");};


	public  Item(String name, double price)
	{this.name = name;
	this.price = price;
	}

}
