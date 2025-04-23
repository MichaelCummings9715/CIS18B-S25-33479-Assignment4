package school;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

class LibraryCollection {
	
	private Map<String, List<Book>> genreMap;
	
	public LibraryCollection() {
		
		genreMap = new HashMap<>();
		
	}
	
	public void addBook(Book book) {
		//TODO: Add books to genreMap
		String genre = book.getGenre();
		genreMap.put(book);
	}
	
	public Iterator<Book> getGenreIterator(String genre) {
		
		//TODO: Return custom iterator for available books in that genre
		return null;
		
	}
	
	//TODO: Add methods to search and return books
	
}
