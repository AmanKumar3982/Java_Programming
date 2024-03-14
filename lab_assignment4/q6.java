import java.util.*;

public class q6 {
    private String Book_name;
    private String author;
    private boolean available;

    public q6(String Book_name, String author){
        this.Book_name = Book_name ;
        this.author = author;
        this. available = true;
    }
    public void borrow_book(){
        
        if (available){
            available = false;
            System.out.println( "The book is successfully borrowed "+ Book_name);
        }else{
            System.out.println("Sorry , the book is not available");
        }
    }
    public void  return_book() {
        if (!available){
            available=true;
            System.out.println("You have successfully returned the book" + Book_name );
        } else {
            System.out.println("This book has already been returned."); 
        }
    }
    public void  display_name(){
        System.out.println("Title: "+ Book_name);
        System.out.println("Author: "+ author);
        System.out.println("Availability: "+available);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        q6[ ] books = new q6[5];

        books[0] = new q6("Let_us_C","Yashwant khanteker");
        books[1] = new q6("Introduction to java", "Jane Smith");
        books[2] = new q6("Python_programming", "Jane Smith");
        books[3] = new q6("Artificial  Intelligence","John Doe");
        books[4] = new q6("DBMS", "Chris Brown");

        System.out.println("////Welcome to the Library Management System////");
        System.out.println("1. Display Available Books");
        System.out.println("2. Borrow a Book");
        System.out.println("3. Return a Book");
        System.out.println("4. Exit");

        System.out.print("Enter your choice:- ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("available Books: ");
                for(q5 book: books) {
                    if(book!=null && book.available){
                        book.display_name();
                    }
                }
                break;
            case 2:
            System.out.println("Enter the name of the book: ");
            String Book_name= sc.nextLine();
            for (q5 book: books){
                if(book!=null&&book.Book_name.equals(Book_name)){
                    book.borrow_book();
                    System.out.println("Book BORROWED SUCCESSFULLY");
                    break;
                }else{
                    System.out.println("book unavailable");
                }
            }
            case 3:
            System.out.print("Enter the title of the book you want to return: ");
                String returnTitle = sc.nextLine();
                for (q5 book : books) {
                    if (book != null && book.Book_name.equals(returnTitle)) {
                        book.return_book();
                        System.out.println("BOOK RETURNED SUCCESSFULLY");
                        break;
                    }else{
                        System.out.println("BOOKED ALREADY RETURNED");
                    }
                }
                break;
            case 4:
            System.out.println("Exiting......");
            System.exit(0);
            break;
            default:
                System.out.println("Invalid choice");
        }

    }



}
