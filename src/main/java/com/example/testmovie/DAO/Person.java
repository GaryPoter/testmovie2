package com.example.testmovie.DAO;

public class Person {
    public static int MALE = 0;

    public static int FEMALE = 1;

    private Long id;

    private String name;

    private Long countryId;

    private String description;

    public static enum Sex{
        MALE,
        FEMALE
    }

    private Sex sex;

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        description = description;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
