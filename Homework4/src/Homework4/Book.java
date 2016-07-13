package Homework4;

class Book {

	private int id, yearOfPublishing, price, pageCount;
	private String nameOfBook, authors, publishingHouse, coverType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYearOfPublishing() {
		return yearOfPublishing;
	}

	public void setYearOfPublishing(int yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public void setNameOfBook(String nameOfBook) {
		this.nameOfBook = nameOfBook;
	}

	public String getNameOfBook() {
		return nameOfBook;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getAuthors() {
		return authors;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setCoverType(String coverType) {
		this.coverType = coverType;
	}

	public String getCoverType() {
		return coverType;
	}

	public Book() {
	}

	public Book(int id, int yearOfPublishing, int price, int pageCount, String nameOfBook, String authors,
			String publishingHouse, String coverType) {
		this.id = id;
		this.yearOfPublishing = yearOfPublishing;
		this.price = price;
		this.pageCount = pageCount;
		this.nameOfBook = nameOfBook;
		this.authors = authors;
		this.publishingHouse = publishingHouse;
		this.coverType = coverType;
	}

	public Book(int id) {
		this.id = id;
	}

	public Book(String nameOfBook, int price) {
		this.nameOfBook = nameOfBook;
		this.price = price;
	}

	public Book(String nameOfBook, String authors) {
		this.nameOfBook = nameOfBook;
		this.authors = authors;
	}
	
	
	@Override
	public String toString() {
		return "[id: " + id + ", NameOfBook: " + nameOfBook + ", Author(s): " + authors + ", Publishing house: " + publishingHouse + ", YearOfPublishing: " + yearOfPublishing + "]";
	}
}
