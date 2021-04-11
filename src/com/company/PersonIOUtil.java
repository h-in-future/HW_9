package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class PersonIOUtil {
    public void writePersons(String filename,Person person){
        FileWriter writer=null;
        try{
            writer=new FileWriter(filename);

            Person wrote=person;
            writer.write(String.valueOf(wrote));


        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
