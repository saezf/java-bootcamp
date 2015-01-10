package t0e1.s1.i2;

public class TestBook {
	public static void main(String[] args) {
		Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
		Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
		// Use an anonymous instance of Author

		Book anotherBook = new Book("more Java for dummy", new Author("Why don't know", "NN@nowhere.com", '?'), 29.95, 888);

		// 1 Printing the name and email of the author from a Book instance.
		// (Hint: aBook.getAuthor().getName(), aBook.getAuthor().getEmail()).
		System.out.println("Name: " + aBook.getAuthor().getName() + ",Email: " + aBook.getAuthor().getEmail());
		// 2 Introduce new methods called getAuthorName(), getAuthorEmail(),
		// getAuthorGender() in the Book class to return the name, email and
		// gender of the author of the book. For example,
		// I did but you never asked to call those methods

		// anyway
		System.out.println("Anoymus name:  " + anotherBook.getAuthorName());
		System.out.println("Anoymus email:  " + anotherBook.getAuthorEmail());
		System.out.println("Anoymus gender:  " + anotherBook.getAuthorGender());

	}

}
