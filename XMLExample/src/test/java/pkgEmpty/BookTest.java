package pkgEmpty;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import pkgLibrary.Book;
import pkgLibrary.BookException;

public class BookTest {

	@Test
	public void testGetBook() throws BookException {
		Book b = Book.getBook("bk102");
		
		assertEquals(b.getTitle(), "Midnight Rain");
		assertEquals(b.getAuthor(), "Ralls, Kim");
		assertEquals(b.getGenre(), "Fantasy");
	}
	@Test
	public void testAddBook() throws BookException, ParseException {
		
		Book b = new Book();
		b.setAuthor("SHA BII");
		b.setTitle("CAOQ SBBB");
		b.setGenre("LL LL LL");
		b.setDescription("YOUSB");
		b.setId("bk993");
		

		String inputString = "11-25-2017";
		DateFormat dateFormat = new SimpleDateFormat("MM-DD-yyyy");
		Date inputDate = dateFormat.parse(inputString);
		
		b.setPublish_date(inputDate);
		
		b.setPrice(5.55);
		
		Book.addBook("catID", b);
		//00
		Book b1 = Book.getBook("bk993");
		
		
		assertEquals(b1.getTitle(), "CAOQ SBBB");
		assertEquals(b1.getAuthor(), "SHA BII");
		assertEquals(b1.getGenre(), "LL LL LL");
		
	}
	

}
