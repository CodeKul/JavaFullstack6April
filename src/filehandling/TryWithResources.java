package filehandling;

import java.io.*;

public class TryWithResources {

    public static void main(String[] args) {
        //character stream
        try(FileWriter fileWriter= new FileWriter("/home/vaibhav/workspace/JavaFullStack6April/src/filehandling/filewritedemo.txt");) {

            fileWriter.write("I am in pune");
            System.out.println("file write successfully");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileReader fileReader = new FileReader("/home/vaibhav/workspace/JavaFullStack6April/src/filehandling/filewritedemo.txt");){
            int i = fileReader.read();
            while (i>0){
                System.out.print((char) i);
                i = fileReader.read();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
