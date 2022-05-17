package filehandling;

import java.io.*;

public class BufferDemo {

    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("bufferDemo.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write("Today is Tuesday");
            System.out.println("file write successfully..");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileReader fileReader = new FileReader("bufferDemo.txt"); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            int i = bufferedReader.read();
            while (i > 0) {
                System.out.print((char) i);
                i = bufferedReader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
