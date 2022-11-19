
public class Book {
	
	private String bookId;
	private String bookName;
	private String bookDesc;
	private int price;
	
	public Book() {
	
	}

	public Book(String bookId, String bookName, String bookDesc, int price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookDesc = bookDesc;
		this.price = price;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookDesc() {
		return bookDesc;
	}

	public void setBookDesc(String bookDesc) {
		this.bookDesc = bookDesc;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
