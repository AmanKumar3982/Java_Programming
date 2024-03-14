import java.util.*;
public class q5 {
    private String Book_name;
    private String author;
    private boolean available;

    public q5(String Book_name, String author) {
        this.Book_name = Book_name;
        this.author = author;
        this.available = true;
    }

    public void borrow_book() {
        if (available) {
            available = false;
            System.out.println("The book is successfully borrowed " + Book_name);
        } else {
            System.out.println("Sorry, the book is not available");
        }
    }

    public void return_book() {
        if (!available) {
            available = true;
            System.out.println("You have successfully returned the book " + Book_name);
        } else {
            System.out.println("This book has already been returned.");
        }
    }

    public void display_name() {
        System.out.println("Title: " + Book_name);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + available);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        q5[] books = new q5[5];

        books[0] = new q5("Let_us_C", "Yashwant Khanteker");
        books[1] = new q5("Introduction to Java", "Jane Smith");
        books[2] = new q5("Python Programming", "Jane Smith");
        books[3] = new q5("Artificial Intelligence", "John Doe");
        books[4] = new q5("DBMS", "Chris Brown");

        System.out.println("////Welcome to the Library Management System////");
        System.out.println("1. Display Available Books");
        System.out.println("2. Borrow a Book");
        System.out.println("3. Return a Book");
        System.out.println("4. Exit");

        System.out.print("Enter your choice:- ");
        int choice = sc.nextInt();
        sc.nextLine();
        while(choice >=1 && choice <= 4){
            switch (choice) {
                case 1:
                    System.out.println("Available Books: ");
                    for (q5 book : books) {
                        if (book != null && book.available) {
                            book.display_name();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter the name of the book: ");
                    String borrowedTitle = sc.nextLine();
                    boolean bookFound = false;
                    for (q5 book : books) {
                        if (book != null && book.Book_name.equals(borrowedTitle)) {
                            book.borrow_book();
                            bookFound = true;
                            break;
                        }
                    }
                    if (!bookFound) {
                        System.out.println("Book Unavailable");
                    }
                    break;
                case 3:
                    System.out.print("Enter the title of the book you want to return: ");
                    String returnTitle = sc.nextLine();
                    boolean bookReturned = false;
                    for (q5 book : books) {
                        if (book != null && book.Book_name.equals(returnTitle)) {
                            book.return_book();
                            bookReturned = true;
                            break;
                        }
                    }
                    if (!bookReturned) {
                        System.out.println("Book already returned or not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting......");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.print("\nEnter your choice:- ");
            choice = sc.nextInt();
            sc.nextLine();
        }
    }
}