public class Item implements MailistSubjet{

	private int itemId;
	private String itemName;
	private double itemPrice;

	public Item(int itemId, String itemName, double itemprice) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemprice;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	@Override
	public String toString() {
		return  itemName + "...... $" + itemPrice;
	}

	@Override
	public void register(MailistObserver obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregister(MailistObserver obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getUpdate(MailistObserver obj) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
