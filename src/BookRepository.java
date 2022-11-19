
public class BookRepository {
	
	Book[] books = new Book[3];
	
	public BookRepository() {
		
		Book book1 = new Book("100", "The Secret History", "Donna Taratt", 50);
		Book book2 = new Book("101", "Brideshead Revisited", "Evelyn Waugh", 45);
		Book book3 = new Book("102", "Anna Karenina", "Leo Tolstoy", 67);

		books[0] = book1;  books[1] = book2;  books[2] = book3;
	}
	
	Book[] getBooks() {
		return books;
	}
	
	Book getBook(int bookId) {
		
		Book book = null;
		
		for(int i = 0; i < books.length; i++) {
			
			System.out.println("The value of i is "+i);
			
			String bukId = books[i].getBookId();
			
			int castedBookId = Integer.parseInt(bukId);//parseInt() of Integer class is used to convert String data into int...
			
			if(bookId == castedBookId) {
				book = books[i];
				break;
			}
			else {
				if(books.length -1 == i) {
					return null;	
				}	
			}
		}
		return book;
		
	}
}
