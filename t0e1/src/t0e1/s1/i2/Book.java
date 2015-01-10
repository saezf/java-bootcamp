package t0e1.s1.i2;

public class Book {
	private String name;
	private double price;
	private Author author;
	private int QtyInStock = 0;

	public Book(String name, Author anAuthor, double price, int QtyInStock) {
		this.name = name;
		this.author = anAuthor;
		this.price = price;
		this.QtyInStock = QtyInStock;
	}

	public String getName() {
		return this.name;
	}

	public Author getAuthor() {
		return this.author;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return this.QtyInStock;
	}

	public void setQtyInStock(int QtyInStock) {
		this.QtyInStock = QtyInStock;
	}

	public String toString() {
		return "" + name + author;
	}

	public String getAuthorName() {
		return getAuthor().getName();
	}

	public String getAuthorEmail() {
		return getAuthor().getEmail();
	}

	public char getAuthorGender() {
		return getAuthor().getGender();
	}
}
