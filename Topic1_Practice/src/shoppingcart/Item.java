package shoppingcart;

public class Item implements MailListSubject{
	private String codItem;
	private String name;
	private int price;
	
	public Item(String codItem, String name, int price){
		this.codItem = codItem;
		this.name = name;
		this.price = price;
	}

	public String getCodItem() {
		return codItem;
	}

	public void setCodItem(String codItem) {
		this.codItem = codItem;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString(){
		return name + " ..... $ " + price; 
	}

	@Override
	public void register(MaillistObserver obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregister(MaillistObserver obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getUpdate(MaillistObserver obj) {
		// TODO Auto-generated method stub
		return null;
	}
}