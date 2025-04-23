package school;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class LibraryCollection {
	
	private Map<String, List<Book>> genreMap;
	
	public LibraryCollection() {
		
		genreMap = new HashMap<>();
		
	}
	
	public void addBook(Book book) {
		
		// Get genres book list.
		List<Book> booksInGenre = genreMap.get(book.getGenre());
		
		if (booksInGenre == null) {
			
			// Make new genre, if genre doesn't exist.
			booksInGenre = new ArrayList<>();
			
			// Add new list to map.
			genreMap.put(book.getGenre(), booksInGenre);
		}
		
		// Add book to list
		booksInGenre.add(book);
		
	}
	
	public Iterator<Book> getGenreIterator(String genre) {
		
		//TODO: Return custom iterator for available books in that genre
		return null;
		
	}
	
	//TODO: Add methods to search and return books
	
}
