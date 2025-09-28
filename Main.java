package Task3;

public class Main {
    public static void main(String[] args) {
        // 1. Create a library instance
        Library myLibrary = new Library();

        // 2. Add books to the library
        myLibrary.addBook(new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"));
        myLibrary.addBook(new Book("B002", "1984", "George Orwell"));
        myLibrary.addBook(new Book("B003", "To Kill a Mockingbird", "Harper Lee"));

        // 3. Add users to the library
        myLibrary.addUser(new User("U101", "Alice"));
        myLibrary.addUser(new User("U102", "Bob"));

        // Display initial state of the library
        System.out.println("📚 Initial Library State:");
        myLibrary.displayBooks();

        // 4. Demonstrate book issuing
        System.out.println("--- Issuing Books ---");
        myLibrary.issueBook("B001", "U101"); // Alice borrows "The Great Gatsby"
        myLibrary.issueBook("B002", "U102"); // Bob borrows "1984"
        myLibrary.issueBook("B001", "U102"); // Attempt to borrow an already issued book (should fail)
        myLibrary.issueBook("B004", "U101"); // Attempt to borrow a non-existent book (should fail)

        // Display state after issuing
        System.out.println("\n📚 Library State After Issuing:");
        myLibrary.displayBooks();

        // 5. Demonstrate book returning
        System.out.println("--- Returning Books ---");
        myLibrary.returnBook("B001", "U101"); // Alice returns "The Great Gatsby"
        myLibrary.returnBook("B003", "U102"); // Attempt to return a book not borrowed by the user (should fail)

        // Display final state of the library
        System.out.println("\n📚 Final Library State:");
        myLibrary.displayBooks();
    }
}
