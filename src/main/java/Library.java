import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    public Library  () {
        this.stock = new ArrayList<>();
        this.capacity = 3;
    }

    public int getBookCount() {
        return stock.size();
    }

    public String addBookToStock(Book book) {
        if (!isFull()) {
            this.stock.add(book);
        return "Book added";
        } else return "insufficient space";
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean isFull() {
        return this.stock.size() >= this.capacity;
    }
}
