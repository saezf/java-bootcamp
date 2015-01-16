
public interface MailistSubjet {
		 
	    //methods to register and unregister observers
	    public void register(MailistObserver obj);
	    public void unregister(MailistObserver obj);
	     
	    //method to notify observers of change
	    public void notifyObservers();
	     
	    //method to get updates from subject
	    public Object getUpdate(MailistObserver obj);
	     
	}

