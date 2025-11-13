// File: Library.java
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> catalog = new ArrayList<>();

    public void addBook(Book book) {
        catalog.add(book);
    }

    public void borrowBook(Person person, String isbn) {
        for (Book b : catalog) {
            if (b.getIsbn().equals(isbn) && !b.isBorrowed()) {
                b.borrow();
                System.out.println(person.getName() + " borrowed book: " + b.getTitle());
                return;
            }
        }
        System.out.println("Book not available.");
    }

    public void returnBook(Person person, String isbn) {
        for (Book b : catalog) {
            if (b.getIsbn().equals(isbn) && b.isBorrowed()) {
                b.returnBook();
                System.out.println(person.getName() + " returned book: " + b.getTitle());
                return;
            }
        }
        System.out.println("Book not found / not borrowed.");
    }
}
