package e1.s1.i2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestBook {
	public static void main(String[] args) {
		Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
		Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
		Book anotherBook = new Book("more Java for dummy", new Author("Why don't know", "NN@nowhere.com", '?'), 29.95, 888);

		System.out.println("Name: " + aBook.getAuthor().getName() + ",Email: " + aBook.getAuthor().getEmail());

		System.out.println("Anoymus name:  " + anotherBook.getAuthorName());
		System.out.println("Anoymus email:  " + anotherBook.getAuthorEmail());
		System.out.println("Anoymus gender:  " + anotherBook.getAuthorGender());
		Calendar cal = new GregorianCalendar(1, 1, 1);
		int dayNumber = cal.get(Calendar.DAY_OF_WEEK);
		String[] calendarDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		System.out.println("It is " + calendarDays[dayNumber - 1]);
	}

}
