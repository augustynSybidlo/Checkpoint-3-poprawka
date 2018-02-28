package model;

public class Author extends Person {
    private int authorId;
    private String name;
    private String surname;
    private int birthYear;



    public Author(String city, String country, int authorId, String name, String surname, int birthYear) {
        super(city, country);
        this.authorId = authorId;
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }
}
