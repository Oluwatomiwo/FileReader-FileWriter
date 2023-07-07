package org.daniel.models;

import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriter2 {
    public static void main(String[] args) throws IOException {
        String file2 = "/Users/decagon/IdeaProjects/Week2ReadingForFile/src/main/resources/teachers.csv";

        String text2 = "TeacherID,Email,FirstName,LastName,GradeLevel\n" +
                "gregory01,ogregory+teacher+academy@chalk.com,Oliver,Gregory,2\n" +
                "lloyd01,slloyd+teacher+academy@chalk.com,Shelley,Lloyd,1\n" +
                "osbourne01,lsobourne+teacher+academy@chalk.com,Lee,Osbourne,1\n" +
                "walton01,jwalton+teacher+academy@chalk.com,Josephine,Walton,3\n" +
                "fernandez01,ifernandez+support+teacher+academy@chalk.com,Inez,Fernandez,4";

        try (BufferedWriter writer = new BufferedWriter(new java.io.FileWriter(file2))) {
            writer.write(text2);
            System.out.println("File Written");
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
