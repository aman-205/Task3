import java.util.*;

class Book {
    private int id;
    private String title;
    private boolean isIssued;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.isIssued = false;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public boolean isIssued() { return isIssued; }

    public void issue() { isIssued = true; }
    public void returnBook() { isIssued = false; }

    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Issued: " + isIssued;
    }
}

class User {
    private int userId;
    private String name;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public int getUserId() { return userId; }
    public String getName() { return name; }

    public String toString() {
        return "User ID: " + userId + ", Name: " + name;
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
    }

    public void viewBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void issueBook(int bookId) {
        for (Book b : books) {
            if (b.getId() == bookId) {
                if (!b.isIssued()) {
                    b.issue();
                    System.out.println("Book issued successfully.");
                } else {
                    System.out.println("Book is already issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(int bookId) {
        for (Book b : books) {
            if (b.getId() == bookId) {
                if (b.isIssued()) {
                    b.returnBook();
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("Book was not issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
}

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        lib.addBook(new Book(1, "Java Basics"));
        lib.addBook(new Book(2, "Data Structures"));
        lib.addBook(new Book(3, "Operating Systems"));

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. View Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    lib.viewBooks();
                    break;
                case 2:
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = sc.nextInt();
                    lib.issueBook(issueId);
                    break;
                case 3:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();
                    lib.returnBook(returnId);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
