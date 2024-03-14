// wap to create a library management system using parameterized constroctor and different methods ?

import java.util.ArrayList;

class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        this.books = new ArrayList<Book>();
        this.users = new ArrayList<User>();
    }

    public Library(ArrayList<Book> books, ArrayList<User> users) {
        this.books = books;
        this.users = users;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void issueBook(String userName, String bookName) {
        for (User user : this.users) {
            if (user.getName().equals(userName)) {
                for (Book book : this.books) {
                    if (book.getName().equals(bookName)) {
                        if (book.isAvailable()) {
                            user.borrowBook(book);
                            book.setAvailable(false);
                        } else {
                            System.out.println("Book is not available");
                        }
                    }
                }
            }
        }
    }

    public void returnBook(String userName, String bookName) {
        for (User user : this.users) {
            if (user.getName().equals(userName)) {
                for (Book book : this.books) {
                    if (book.getName().equals(bookName)) {
                        user.returnBook(book);
                        book.setAvailable(true);
                    }
                }
            }
        }
    }
}

class Book {
    private String name;
    private boolean available;

    public Book(String name, boolean available) {
        this.name = name;
        this.available = available;
    }

    public String getName() {
        return this.name;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class User {
    private String name;
    private ArrayList<Book> borrowedBooks;

    public User(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<Book>();
    }

    public String getName() {
        return this.name;
    }

    public void borrowBook(Book book) {
        this.borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        this.borrowedBooks.remove(book);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Book1", true));
        books.add(new Book("Book2", true));

        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("User1"));
        users.add(new User("User2"));

        Library library = new Library(books, users);

        // Adding books to the library
        library.addBook(new Book("Book3", true));

        // Adding users to the library
        library.addUser(new User("User3"));

        // Issue a book
        library.issueBook("User1", "Book1");

        // Return a book
        library.returnBook("User1", "Book1");
    }
}