package shoppingcart;

public interface MaillistObserver{
	//method to update the observer, used by subject
    public void update();
     
    //attach with subject to observe
    public void setSubject(MailListSubject sub);
}