package Library;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        Librarian librarian = new Librarian("John", library);

        library.addBook(new Book("001", "Java Programming", "Author A", 5));
        library.addBook(new Book("002", "Data Structures", "Author B", 3));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println();
            System.out.println("Library Management System");
            System.out.println("1. Add a Book");
            System.out.println("2. Issue a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.println();

            choice = scanner.nextInt();
            scanner.nextLine();  // Clear the newline

            switch (choice) {
                case 1:
                    // Add a new book to the library
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter number of copies: ");
                    int copies = scanner.nextInt();
                    String bookID = "B" + (library.getBookCount() + 1); // Generate book ID
                    library.addBook(new Book(bookID, title, author, copies));
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    // Issue a book to a student
                    System.out.print("Enter book title to issue: ");
                    title = scanner.nextLine();
                    Book bookToIssue = library.searchBookByTitle(title);
                    if (bookToIssue != null) {
                        System.out.print("Enter student name: ");
                        String studentName = scanner.nextLine();
                        Student student = new Student(studentName);  // You can extend this by creating a Student registry
                        student.issueBook(bookToIssue);
                        Transaction issueTransaction = new Transaction("TXN" + System.currentTimeMillis(), student, bookToIssue, "Issue");
                        issueTransaction.recordTransaction();
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;

                case 3:
                    // Return a book to the library
                    System.out.print("Enter book title to return: ");
                    title = scanner.nextLine();
                    Book bookToReturn = library.searchBookByTitle(title);
                    if (bookToReturn != null) {
                        System.out.print("Enter student name: ");
                        String returningStudent = scanner.nextLine();
                        Student student = new Student(returningStudent);
                        student.returnBook(bookToReturn);
                        Transaction returnTransaction = new Transaction("TXN" + System.currentTimeMillis(), new Student(returningStudent), bookToReturn, "Return");
                        returnTransaction.recordTransaction();
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;

                case 4:
                    // Display all books
                    library.displayBooks();
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
