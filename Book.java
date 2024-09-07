public class Book {
    String title;
    String author;
    boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Borrowed: " + isBorrowed);
    }
}

