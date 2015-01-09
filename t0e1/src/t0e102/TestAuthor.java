package t0e102;

public class TestAuthor {
	public static void main(String[] args) {
	Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
		System.out.println(anAuthor.toString());   // call toString()
	anAuthor.setEmail("paul@nowhere.com");
	System.out.println(anAuthor);}
}
