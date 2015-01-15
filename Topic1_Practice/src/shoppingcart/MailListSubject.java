package shoppingcart;

public interface MailListSubject{
	// methods to register and unregister observers
	public void register(MaillistObserver obj);
	public void unregister(MaillistObserver obj);
	
	//method to notify observers of change
	public void notifyObservers();
	
	//method to get updates from subject
	public Object getUpdate(MaillistObserver obj);
}