import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;

    public Library  () {
        this.stock = new ArrayList<>();
    }

    public int getBookCount() {
        return stock.size();
    }

    public void addBookToStock(Book book) {
        this.stock.add(book);
    }
}
