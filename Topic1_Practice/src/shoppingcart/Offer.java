package shoppingcart;

public class Offer implements MailListSubject{
	private String name;
	private int price;
	Item item;
	
	public Offer(String name, int price, Item item){
		this.name = name;
		this.price = price;
		this.item = item;
		notifyObservers();
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		notifyObservers();
		return price;
	}
	
	public String toString(){
		return name + " ..... $ " + price + " \n   " + item.toString();
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