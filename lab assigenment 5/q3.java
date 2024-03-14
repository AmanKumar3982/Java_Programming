class LibraryItem {
    private String title;
    private boolean checkedOut;

    public LibraryItem(String title) {
        this.title = title;
        this.checkedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void checkOut() {
        if (!checkedOut) {
            checkedOut = true;
            System.out.println(title + " checked out successfully.");
        } else {
            System.out.println(title + " is already checked out.");
        }
    }

    public void returnItem() {
        if (checkedOut) {
            checkedOut = false;
            System.out.println(title + " returned successfully.");
        } else {
            System.out.println(title + " is not checked out.");
        }
    }
}

class Book extends LibraryItem {
    private String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class DVD extends LibraryItem {
    private String director;

    public DVD(String title, String director) {
        super(title);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }
}

class Journal extends LibraryItem {
    private String publisher;

    public Journal(String title, String publisher) {
        super(title);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }
}

public class q3 {
    public static void main(String[] args) {
        Book book = new Book("To Kill a Mockingbird", "Harper Lee");
        DVD dvd = new DVD("Inception", "Christopher Nolan");
        Journal journal = new Journal("Nature", "Nature Publishing Group");

        book.checkOut();
        dvd.checkOut();
        journal.checkOut();

        book.returnItem();
        dvd.returnItem();
        journal.returnItem();
    }
}
