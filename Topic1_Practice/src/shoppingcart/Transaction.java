package shoppingcart;

public class Transaction implements MailListSubject{
	private int id;
	
	public Transaction(){
		UniqueSequenceSingleton.getInstance();
	}

	public int getId() {
		this.id = UniqueSequenceSingleton.getNext();
		notifyObservers();
		return id;
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