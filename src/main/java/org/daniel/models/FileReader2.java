package org.daniel.models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReader2 {

    public static void main(String[] args)  {


        try (BufferedReader StudentFile = new BufferedReader(new FileReader("/Users/decagon/IdeaProjects/Week2ReadingForFile/src/main/resources/teachers.csv"))) {

            //print Teachers at console
            System.out.println("Teachers");
            //used a while loop to continue reading the file
            String line;
            while ((line = StudentFile.readLine()) != null){
            //prints out line
                System.out.println("Teacher: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
