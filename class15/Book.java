package class15;

public class Book {
    private String name;
    private String author;
    private int year;
    private int pages;
    private int isbn;

    public Book(String name, String author, int year, int pages, int isbn) {
        this(name, author, year);
        this.pages = pages;
        this.isbn = isbn;
    }

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public void printAllInfo() {
        System.out.println(name + " " + author + " " + year + " " + pages + " " + isbn);
    }
        public void printInfo() {
            System.out.println(name + " " + author + " " + year);

    }

    public static void main(String[] args) {
        Book b1 = new Book("Java for Dummies", "Asghar", 2023, 1500, 1236545);
            b1.printInfo();
            Book b2 = new Book("Java for Dummies", "Asghar", 2023);
        b2.printInfo();
        }


    }
