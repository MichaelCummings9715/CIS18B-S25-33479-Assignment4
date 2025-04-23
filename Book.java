package school;

class Book {
	
	private String title;
	private String author;
	private String genre;
	private Boolean isAvailable;
	
	//constructor
	public Book(String title, String author, String genre) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.isAvailable = true;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}
	
	public void checkout () throws BookNotAvailableException {
		if (!isAvailable) {
			throw new BookNotAvailableException("Book is not available.");
		}
	}
	
	public void returnBook() {
		this.isAvailable = true;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String toString() {
		return title + "by" + author + "(" + genre + ")";
	}

}
