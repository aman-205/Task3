# 📚 Java Library Management System

This is a simple Java console-based application that simulates a basic **Library Management System**. It allows users to **view**, **issue**, and **return** books using Java classes and an `ArrayList`.

---

## 🧾 Features

- View available books
- Issue a book (if not already issued)
- Return a book
- Menu-driven CLI interface

---

## 🏗️ Class Structure

### 1. `Book`
Represents a book in the library.
- Fields: `id`, `title`, `isIssued`
- Methods: `issue()`, `returnBook()`, `toString()`

### 2. `User`
Represents a library user.
- Fields: `userId`, `name`

### 3. `Library`
Handles the book collection and operations.
- Stores books in an `ArrayList`
- Methods: `addBook()`, `viewBooks()`, `issueBook()`, `returnBook()`

---

## 🖥️ How to Run

1. **Save the file** as `LibrarySystem.java`
2. Open terminal or command prompt
3. Compile the file:

```bash
javac LibrarySystem.java
