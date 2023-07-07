package org.daniel;


import org.daniel.models.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReader1 {


    public static void main(String[] args) {

        try (BufferedReader StudentFile = new BufferedReader(new FileReader("/Users/decagon/IdeaProjects/Week2ReadingForFile/src/main/resources/student.csv"))) {


            System.out.println("Student");
            String line;
            while ((line = StudentFile.readLine()) != null){

                //split line and stored in new array
                String[] data = line.split((","));
                //created new array(temps) with 9 as length
                String[] temp = new String[9];

                //used for loop to copy data to temp
                for(int i = 0; i < data.length; i++){

                    temp[i]=data[i];
                }
                //created instance of student class
                Student student = new Student();
                //extracted studentID from array and convert to string
                student.setStudentID(String.valueOf((temp[7])));

                //printed array to string
                System.out.println("Student: " + Arrays.toString(temp));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}







