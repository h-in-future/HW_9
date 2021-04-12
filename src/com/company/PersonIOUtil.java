package com.company;

import java.io.FileWriter;
import java.io.IOException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class PersonIOUtil {

    public static void writePerson(String fileName, List<Person> personList) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Person person : personList) {
                writer.write(person.getName()
                        + " " + person.getSurname()
                        + " " + person.adress.getCity()
                        + " " + person.adress.getStreet()
                        + " " + person.adress.getHouseNumber() + "\n");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Person> readPerson(String filName) throws EmptySourceFileException, IOException {
        List<Person> personList1 = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filName))) {
            String q;
            while ((q = reader.readLine()) != null) {
                String[] dataArray = q.split(" ");
                String name = dataArray[0];
                String lastName = dataArray[1];
                String city = dataArray[2];
                String street = dataArray[3];
                int numberHome = Integer.parseInt(dataArray[4]);
                Person person = new Person(name, lastName, new Adress(city, street, numberHome));
                personList1.add(person);


            }
            if (personList1.size() == 0) {
                throw new EmptySourceFileException("Файл пуст");
            }
        } catch (EmptySourceFileException | IOException e) {
            e.printStackTrace();
        }

        return personList1;
    }
}