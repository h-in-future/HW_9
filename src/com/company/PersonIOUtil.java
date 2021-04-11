package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class PersonIOUtil {
    FileWriter writer=null;
    public void writePersons(String filename,Person person){

        try{
            writer=new FileWriter(filename);


            writer.write(person.toString());


        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
