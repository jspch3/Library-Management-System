package Task3;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books;
    private final List<User> users;

    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    // Methods to add books and users to the library
    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    // Helper method to find a book by its ID
    private Book findBookById(String bookId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }
        return null;
    }

    // Helper method to find a user by their ID
    private User findUserById(String userId) {
        for (User user : users) {
            if (user.getUserId().equals(userId)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Issues a book to a user.
     * @param bookId The ID of the book to be issued.
     * @param userId The ID of the user borrowing the book.
     */
    public void issueBook(String bookId, String userId) {
        Book book = findBookById(bookId);
        User user = findUserById(userId);

        if (book == null) {
            System.out.println("Error: Book with ID " + bookId + " not found. ❌");
            return;
        }
        if (user == null) {
            System.out.println("Error: User with ID " + userId + " not found. ❌");
            return;
        }
        if (book.isIssued()) {
            System.out.println("Sorry, the book '" + book.getTitle() + "' is already issued. 😔");
            return;
        }

        book.setIssued(true);
        user.borrowBook(book);
        System.out.println("Success: '" + book.getTitle() + "' issued to " + user.getName() + ". ✅");
    }

    /**
     * Returns a book from a user.
     * @param bookId The ID of the book being returned.
     * @param userId The ID of the user returning the book.
     */
    public void returnBook(String bookId, String userId) {
        Book book = findBookById(bookId);
        User user = findUserById(userId);

        if (book == null) {
            System.out.println("Error: Book with ID " + bookId + " not found. ❌");
            return;
        }
        if (user == null) {
            System.out.println("Error: User with ID " + userId + " not found. ❌");
            return;
        }
        if (!book.isIssued() || !user.getBorrowedBooks().contains(book)) {
            System.out.println("Error: This book was not issued to this user. 🤔");
            return;
        }

        book.setIssued(false);
        user.returnBook(book);
        System.out.println("Success: '" + book.getTitle() + "' returned by " + user.getName() + ". ✅");
    }
    
    // Method to display all books in the library
    public void displayBooks() {
        System.out.println("\n--- Library Book Collection ---");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("-----------------------------\n");
    }
}
