package com.company;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, EmptySourceFileException {
	Adress malina=new Adress("Minsk","Malina",23);
	Adress leningradskaya=new Adress("Minsk","Leningradskaya",44);
	Adress empty=new Adress("Empty","Empty",0);
	Person vitya=new Person("Vitya","Milyga",malina);
        Person vova=new Person("Vova","Milyga",leningradskaya);
        Person someone=new Person("Unknowed","Buka",empty);
        System.out.println(" Ludi:\n "+vitya+" "+vova+""+someone);

        List<Person> personlist = new ArrayList<>();
        personlist.add(vitya);
        personlist.add(vova);
        personlist.add(someone);

        PersonIOUtil.writePerson("Person.txt", personlist);
        System.out.println(PersonIOUtil.readPerson("Person.txt") + "\n");
    }
}
