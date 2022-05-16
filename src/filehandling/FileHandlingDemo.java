package filehandling;

import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args) {

        //byte stream
        File file = new File("text.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            String str = "Pune";
            byte[] arr = str.getBytes();
            fileOutputStream.write(arr);


            System.out.println("file write successfully..");
            fileOutputStream.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int i = fileInputStream.read();
            while (i>0){
                System.out.print((char) i);
                i = fileInputStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
