package filehandling;

import java.io.*;

public class ByteArrayDemo {

    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream1 = new FileOutputStream("byte1.txt");
            FileOutputStream fileOutputStream2 = new FileOutputStream("byte2.txt");

            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] arr = "Pune".getBytes();
            byteArrayOutputStream.write(arr);

            byteArrayOutputStream.writeTo(fileOutputStream1);
            byteArrayOutputStream.writeTo(fileOutputStream2);

            byteArrayOutputStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fileInputStream1 = new FileInputStream("byte1.txt");
            FileInputStream fileInputStream2 = new FileInputStream("byte2.txt");

            SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream1,fileInputStream2);

            int i = sequenceInputStream.read();
            while (i>0){
                System.out.print((char) i);
                i = sequenceInputStream.read();
            }

            sequenceInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
