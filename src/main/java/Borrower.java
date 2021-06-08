import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower () {
        this.collection = new ArrayList<>();
    }

    public int getNumOfBorrowedBooks() {
        return this.collection.size();
    }

    public void borrowBook(Book book) {
        this.collection.add(book);
    }

    public Book findBookByIndex(int index){
        Book foundBook = this.collection.get(index);
        return foundBook;
    }


}
