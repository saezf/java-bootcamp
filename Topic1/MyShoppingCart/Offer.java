
public class Offer implements MailistSubjet {
	public String offerName;
	public double offerPrice;
	public int offerId;
	public Item[] offerItems;
	
	
	public Offer(String offerName, double offerPrice, int offerId, Item[] offerItems) {
		
		this.offerName = offerName;
		this.offerPrice = offerPrice;
		this.offerId = offerId;
		this.offerItems = offerItems;
	}

	


	
	
	public String toString() {
		return  offerName + "...... $" + offerPrice;
		
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
