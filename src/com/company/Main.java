package com.company;

public class Main {

    public static void main(String[] args) {
	Adress malina=new Adress("Minsk","Malina",23);
	Adress leningradskaya=new Adress("Minsk","Leningradskaya",44);
	Adress empty=new Adress("Empty","Empty",0);
	Person vitya=new Person("Vitya","Milyga",malina);
        Person vova=new Person("Vova","Milyga",leningradskaya);
        Person someone=new Person("Unknowed","Buka",empty);
        System.out.println(" Ludi: "+vitya+" "+vova+""+someone);
        vova.writePersons("test",vova);
    }
}
