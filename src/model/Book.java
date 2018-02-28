package model;

public class Book {
    private int ISBN;
    private Author author;
    private String title;
    private Publisher publisher;
    private int publicationYear;
    private double price;
    private String type;


    public Book(int ISBN, Author author, String title, Publisher publisher,
                int publicationYear, double price, String type) {
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.price = price;
        this.type = type;
    }
}
