import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (Book book : books) {
            book.display();
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title) && !book.isBorrowed) {
                book.isBorrowed = true;
                System.out.println("You have borrowed: " + title);
                return;
            }
        }
        System.out.println("Book not available or already borrowed.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title) && book.isBorrowed) {
                book.isBorrowed = false;
                System.out.println("You have returned: " + title);
                return;
            }
        }
        System.out.println("Book not found or not borrowed.");
    }
}
