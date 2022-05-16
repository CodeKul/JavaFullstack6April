package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        FileReader fileReader = null;
        //character stream
        try {
            fileWriter = new FileWriter("/home/vaibhav/workspace/JavaFullStack6April/src/filehandling/filewritedemo.txt");
            fileWriter.write("I am in pune");
            System.out.println("file write successfully");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        try {
            fileReader = new FileReader("/home/vaibhav/workspace/JavaFullStack6April/src/filehandling/filewritedemo.txt");
            int i = fileReader.read();
            while (i>0){
                System.out.print((char) i);
                i = fileReader.read();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
