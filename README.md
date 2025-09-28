# Library-Management-System
📚 Java Library Management System
A simple, console-based library management system built with Java. This project demonstrates core object-oriented principles by simulating the process of issuing and returning books.

✨ Features
Class-Based Structure: Organizes logic into Book, User, and Library classes.

Issue Books: Assign a book to a user, making it unavailable for others.

Return Books: Mark a book as returned and available again in the library.

Status Tracking: Each book's availability (isIssued) is tracked.

Error Handling: Provides user-friendly messages for invalid operations (e.g., issuing an already issued book).

📂 Project Structure
This project consists of four main classes:

Book.java: Represents a book with properties like bookId, title, author, and isIssued.

User.java: Represents a library user with a userId, name, and a list of borrowedBooks.

Library.java: The core class that manages the collections of books and users, and contains the logic for issueBook() and returnBook().

Main.java: The driver class to run a simulation and demonstrate the system's functionality.
