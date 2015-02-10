/**
 * 
 */
package t1;

import java.util.ArrayList;


/**
 * @author Christian db
 *
 */
public class MailListObserver implements Observer{

	ArrayList<String> mailList;
	public ArrayList<String> getMailList() {
		return mailList;
	}
	public void setMailList(ArrayList<String> mailList) {
		this.mailList = mailList;
	}
	public void addMail(String mail) {
		 mailList.add(mail);
	}

	public void removeMail(String mail) {
		mailList.remove(mail);
	}
	/* (non-Javadoc)
	 * @see t1.Observer#doUpdate()
	 */
	@Override
	public void doUpdate() {
		// TODO Auto-generated method stub
		
	}
	public void sendMails(){}
	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */


}
