package model;

public abstract class Person {
    private String city;
    private String country;

    public Person(String city, String country) {
        this.city = city;
        this.country = country;
    }
}
