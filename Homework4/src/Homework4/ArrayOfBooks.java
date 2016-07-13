package Homework4;

public class ArrayOfBooks {

	public Book[] arrayOfBooks;// declare a variable of type Book

	public ArrayOfBooks() {
		arrayOfBooks = new Book[5];// initialization a variable of type Book
		/*
		 * fill an array of books
		 */
		arrayOfBooks[0] = new Book(1554452);
		arrayOfBooks[1] = new Book(15548996, 1991, 5000, 230, "JAVA", "Blinov", "Minsk", "Full cover");
		arrayOfBooks[2] = new Book(15548996, 1978, 5000, 230, "JAVA Methods", "Pirogov", "Minsk", "Full");
		arrayOfBooks[3] = new Book(15548996, 2003, 5000, 230, "JAVA", "Blinov", "Grodno", "Not full");
		arrayOfBooks[4] = new Book(15548996, 1989, 5000, 230, "JAVA Methods", "Slinov", "Minsk", "Full cover");
	}

	/*
	 * method which show all books
	 */
	public void showArrayOfBooks() {
		System.out.println("Все книги:");
		for (int i = 0; i <= 4; i++) {
			System.out.println(arrayOfBooks[i].toString());
		}
		System.out.println();

	}

	/*
	 * method which show books on the set author
	 */
	public void showAuthorArrayOfBooks() {
		System.out.println("Список книг заданного автора:");
		for (int i = 0; i <= 4; i++) {
			if (arrayOfBooks[i].getAuthors() == "Blinov")
				System.out.println(arrayOfBooks[i].toString());
		}
		System.out.println();
	}

	/*
	 * method which show books on the set publishing house
	 */
	public void showpublishingHouse() {
		System.out.println("Список книг, выпущенных заданным издательством:");
		for (int i = 0; i <= 4; i++) {
			if (arrayOfBooks[i].getPublishingHouse() == "Minsk")
				System.out.println(arrayOfBooks[i].toString());
		}
		System.out.println();
	}

	/*
	 * method which show books after the set year
	 */
	public void showYearAfter() {
		System.out.println("Cписок книг, выпущенных после заданного года.");
		for (int i = 0; i <= 4; i++) {
			if (arrayOfBooks[i].getYearOfPublishing() >= 1990)
				System.out.println(arrayOfBooks[i].toString());
		}
		System.out.println();
	}
}