import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Runner {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		UserRepository userRepository = new UserRepository();
		BookRepository bookRepository = new BookRepository();


		boolean flag = true;

		while(flag) {

			System.out.println("Press 1 for Registartion, Press 2 for Login and Press 0 for Exit");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:

				userRepository.register();

				break;

			case 2:

				String username = userRepository.login();

				System.out.println("Press 0 for logout or Press 1 to see any Book Detail by Book-Id or press 2 for Exit or Press 3 to update User Profile!!");

				int inputAfterLogin = sc.nextInt();

				switch (inputAfterLogin) {

				case 0:
					System.out.println("Logout Successfully");
					break;

				case 1:

					boolean bookPresentFlag = true;
					while(bookPresentFlag) {

						System.out.println("Enter the Book-Id");

						int bookId = sc.nextInt();
						Book book = bookRepository.getBook(bookId);

						System.out.println("Below is the Book Detail...");

						if(book != null) {
							System.out.println(book.getBookId()+", "+book.getBookName()+", "+book.getBookDesc()+", "+book.getPrice());	
							bookPresentFlag = false;
						}
						else {
							System.out.println("Book not Present by that BookId, please try again!!");
						}
					}
					break;
				case 2:
					System.out.println("Goodbye, see you again!!");
					flag = false;

				case 3:

					User user = userRepository.getUser(username);

					System.out.println("here are your current details..");

					System.out.println(user.getUsername()+", "+user.getName()+", "+user.getEmail());

					System.out.println("press 1 to change the name and press 2 to change the Email!!");

					int updateUseroption = sc.nextInt();

					switch(updateUseroption) {

					case 1:

						System.out.println("Enter your name");

						String name = sc.next();

						user.setName(name);

						userRepository.updateUser(user);

						System.out.println("User Updated Successfully...");
						break;
					case 2:

						System.out.println("Enter your Email");

						String email = sc.next();

						user.setName(email);

						userRepository.updateUser(user);

						System.out.println("User Updated Successfully...");
					}
				}


				break;

			case 0:
				System.out.println("Goodbye, see you again!!");
				flag = false;
			}
		}
	}
}
