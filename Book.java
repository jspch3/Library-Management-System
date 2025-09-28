package Task3;


public class Book {
    private String bookId;
    private String title;
    private String author;
    private boolean isIssued;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isIssued = false; // By default, a new book is not issued
    }

    // Getters
    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    // Setter for issue status
    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: '" + title + "', Author: '" + author + "', Issued: " + isIssued;
    }
}

