package Homework4;

public class ArrayOfBooks {

	public Book[] arrayOfBooks;

	public ArrayOfBooks() {
		arrayOfBooks = new Book[5];
		arrayOfBooks[0] = new Book(1554452);
		arrayOfBooks[1] = new Book(15548996, 1991, 5000, 230, "JAVA", "Blinov", "Minsk", "Full cover");
		arrayOfBooks[2] = new Book(15548996, 1978, 5000, 230, "JAVA Methods", "Pirogov", "Minsk", "Full");
		arrayOfBooks[3] = new Book(15548996, 2003, 5000, 230, "JAVA", "Blinov", "Grodno", "Not full");
		arrayOfBooks[4] = new Book(15548996, 1989, 5000, 230, "JAVA Methods", "Slinov", "Minsk", "Full cover");
	}

	public void showArrayOfBooks() {
		System.out.println("Все книги:");
		for (int i = 0; i <= 4; i++) {
			System.out.println(arrayOfBooks[i].toString());
		}
		System.out.println();

	}
	
	public void showAuthorArrayOfBooks(){
		System.out.println("Список книг заданного автора:");
		for (int i = 0; i <= 4; i++) {
			if (arrayOfBooks[i].getAuthors()=="Blinov")
			System.out.println(arrayOfBooks[i].toString());
		}
		System.out.println();
	}
	
	public void showpublishingHouse(){
		System.out.println("Список книг, выпущенных заданным издательством:");
		for (int i = 0; i <= 4; i++) {
			if (arrayOfBooks[i].getPublishingHouse()=="Minsk")
			System.out.println(arrayOfBooks[i].toString());
		}
		System.out.println();
	}
	
	public void showYearAfter(){
		System.out.println("Cписок книг, выпущенных после заданного года.");
		for (int i = 0; i <= 4; i++) {
			if (arrayOfBooks[i].getYearOfPublishing()>= 1990)
			System.out.println(arrayOfBooks[i].toString());
		}
		System.out.println();
	}
}