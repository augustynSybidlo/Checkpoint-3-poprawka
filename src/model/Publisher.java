package model;

public class Publisher extends Person{
    private String publisherId;
    private String name;

    public Publisher(String city, String country, String publisherId, String name) {
        super(city, country);
        this.publisherId = publisherId;
        this.name = name;
    }
}
