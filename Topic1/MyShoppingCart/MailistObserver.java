
public interface MailistObserver {
	     
	    //method to update the observer, used by subject
	    public void update();
	     
	    //attach with subject to observe
	    public void setSubject(MailistSubjet sub);
	}

