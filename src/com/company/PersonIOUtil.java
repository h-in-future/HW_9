package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class PersonIOUtil {
    FileWriter writer=null;
    public void writePersons(String filename,Person person){

        try{
            writer=new FileWriter(filename);

            Person wrote=person;
            writer.write(String.valueOf(wrote));


        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
