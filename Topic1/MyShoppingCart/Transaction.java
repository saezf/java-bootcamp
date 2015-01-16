

public class Transaction implements MailistSubjet {
	public UniqueSequentialNumberSingleton idTransaction;

	public Transaction(UniqueSequentialNumberSingleton idTransaction) {
		this.idTransaction = idTransaction;
	}

	public UniqueSequentialNumberSingleton getIdTransaction() {
		return idTransaction;
	}

	public void setIdTransaction(int idTransaction) {
		UniqueSequentialNumberSingleton uid = UniqueSequentialNumberSingleton.getUniqueSequentialNumber();
		this.idTransaction = uid;
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
