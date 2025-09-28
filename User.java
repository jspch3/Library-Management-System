package Task3;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userId;
    private String name;
    private List<Book> borrowedBooks;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters
    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
    
    // Methods to manage borrowed books
    public void borrowBook(Book book) {
        this.borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        this.borrowedBooks.remove(book);
    }

    @Override
    public String toString() {
        return "User ID: " + userId + ", Name: '" + name + "', Borrowed Books: " + borrowedBooks.size();
    }
}
