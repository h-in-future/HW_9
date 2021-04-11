package com.company;

public class Person extends PersonIOUtil{
    private String name;
    private String surname;
    private Adress adress;

    public Person(String name, String surname, Adress adress) {
       this.adress=adress;
        this.name = name;
        this.surname = surname;
        if (this.name == null || this.surname == null || this.adress == null) {
            throw new NullFieldException("Field must not be empty");
        }

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return " Name: " + getName() +
                " Surname: " + getSurname() +
                " Adress: " + adress.getCity() + " " + adress.getStreet()
                + " " + adress.getHouseNumber() + "\n";
    }
}
