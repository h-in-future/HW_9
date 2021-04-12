package com.company;

public class Person extends PersonIOUtil{
    public String name;
    public String surname;
    public Adress adress;

    public Person(String name, String surname, Adress adress) {
       this.adress=adress;
        this.name = name;
        this.surname = surname;
        if (name == null || surname == null || adress == null) {
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

    public String getAdress() {
        return adress.getCity() + " " + adress.getStreet()
                + " " + adress.getHouseNumber()+" ";
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return " Name: " + getName() +
                " Surname: " + getSurname() +
                " Adress: " + getAdress() + "\n";
    }
}
