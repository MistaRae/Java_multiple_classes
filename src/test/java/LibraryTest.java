import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class LibraryTest {

    private Library library;
    private Book code;
    private Book dune;
    private Book theHobbit;
    private Book learnToProgram;
    private Borrower mark;


    @Before
    public void setUp(){
        library = new Library();
        mark = new Borrower();
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
    public void libraryCanCheckIfStockIsFull(){
        assertFalse(library.isFull());
    }

    @Test
    public void libraryWontExceedCapacity(){
        library.addBookToStock(code);
        library.addBookToStock(dune);
        library.addBookToStock(theHobbit);
        assertEquals("insufficient space",library.addBookToStock(learnToProgram));
    }

    @Test
    public void borrowerCanBorrow(){
        library.addBookToStock(theHobbit);
        mark.borrowBook(theHobbit);
        assertEquals(1, mark.getNumOfBorrowedBooks());

        assertEquals("The Hobbit", );

    }


}
