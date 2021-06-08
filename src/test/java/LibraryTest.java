import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void setUp(){
        library = new Library();
        book = new Book("Code", "Charles Petzold", "General Computing");
        book = new Book("Dune", "Frank Herbert", "Science-Fiction");
        book = new Book("The Hobbit", "JRR Tolkien", "Fantasy");
        book = new Book("Learn to Program", "Chris Pine", "General Computing");
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void libraryCanAddBooksToStock(){
        library.addBookToStock(book);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void libraryHasCapacity(){

    }


}
