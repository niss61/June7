
class Book {
    protected String title;
    protected String author;


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}


class FictionBook extends Book {

    public FictionBook(String title, String author) {
        super(title, author); // Calls the constructor of the Book class
    }
}


class NonFictionBook extends Book {

    public NonFictionBook(String title, String author) {
        super(title, author); // Calls the constructor of the Book class
    }
}


class TechnicalBook extends NonFictionBook {

    public TechnicalBook(String title, String author) {
        super(title, author); // Calls the constructor of the NonFictionBook class
    }
}



public class LibraryDemo {
    public static void main(String[] args) {
        System.out.println("--- Displaying Fiction Book Details ---");
        Book fiction = new FictionBook("The Great Gatsby", "F. Scott Fitzgerald");
        fiction.displayDetails();

        System.out.println("\n--- Displaying Non-Fiction Book Details ---");
        Book nonFiction = new NonFictionBook("Sapiens: A Brief History of Humankind", "Yuval Noah Harari");
        nonFiction.displayDetails();

        System.out.println("\n--- Displaying Technical Book Details ---");
        Book techBook = new TechnicalBook("Clean Code", "Robert C. Martin");
        techBook.displayDetails();
    }
}
