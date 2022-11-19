import java.util.Scanner;

public class UserRepository {

	Scanner sc = new Scanner(System.in);
	User[] users = new User[4];

	void register() {

		System.out.println("Enter your Name!!");
		String name = sc.next();

		System.out.println("Enter your Username!!");
		String username = sc.next();

		System.out.println("Enter your password");
		String password = sc.next();

		System.out.println("Enter your Email-Id");
		String email = sc.next();

		User user = new User(username, password, username, email);

		for(int i = 0; i < users.length; i++) {

			if(users[i] == null) {
				users[i] = user;
				break;
			}
		}
	}

	String login() {
		
		BookRepository bookRepository = new BookRepository();
		Book[] books = bookRepository.getBooks();


		boolean loginFlag = true;
		String username = null;;
		while(loginFlag) {

			System.out.println("Enter your Username!!");
			username = sc.next();

			System.out.println("Enter your Password!!");
			String password = sc.next();

			for(int i = 0; i < users.length; i++) {

				if(users[i] == null) {
					System.out.println("Credentials wrong, please try again!!");
					break;
				}

				String uname = users[i].getUsername();
				String pwd = users[i].getPassword();

				if(uname.equals(username) && pwd.equals(password)) {
					System.out.println("Welcome "+users[i].getName());

					for(Book book : books) {

						System.out.println(book.getBookId()+", "+book.getBookName()+", "+book.getBookDesc()+", "+book.getPrice());
					}
					loginFlag = false;
					break;
				}
			}
		}
		return username;
	}
	
	User getUser(String username) {
		
		User user = null;
		
		for(int i = 0; i < users.length; i++) {
			
			if(username.equals(users[i].getUsername())) {
				user = users[i];
				break;
			}
		}
		return user;
	}
	
	void updateUser(User user) {
		
		for(int i = 0; i < users.length; i++) {
			
			if(user.getUsername().equals(users[i].getUsername())) {
				users[i].setName(user.getName());
				users[i].setEmail(user.getEmail());
				break;
			}
		}
	}

}
