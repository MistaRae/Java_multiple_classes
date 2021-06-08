import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book code;
    private Book dune;
    private Book theHobbit;
    private Book learnToProgram;


    @Before
    public void setUp(){
        library = new Library();
        code = new Book("Code", "Charles Petzold", "General Computing");
        dune = new Book("Dune", "Frank Herbert", "Science-Fiction");
        theHobbit = new Book("The Hobbit", "JRR Tolkien", "Fantasy");
        learnToProgram = new Book("Learn to Program", "Chris Pine", "General Computing");
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void libraryCanAddBooksToStock(){
        library.addBookToStock(code);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void libraryHasCapacity(){
        assertEquals(3, library.getCapacity());
    }

    @Test
    public void libraryWontExceedCapacity(){
        library.addBookToStock(code);
        library.addBookToStock(dune);
        library.addBookToStock(theHobbit);
        assertEquals("insufficient space",library.addBookToStock(learnToProgram));
    }


}
