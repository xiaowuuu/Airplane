package org.example;

public abstract class PersonName {
    public String getName() {
        return name;
    }
    private String name;
    public PersonName(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
