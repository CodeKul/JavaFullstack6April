package filehandling;

import java.io.*;

public class BufferOutInDemo {
    public static void main(String[] args) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("fileOut.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            String str = "Pune";
            byte[] arr = str.getBytes();
            bufferedOutputStream.write(arr);
            System.out.println("file write successfully..");

            bufferedOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("fileOut.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int i = bufferedInputStream.read();

            while (i>0){
                System.out.print((char)i);
                i = bufferedInputStream.read();
            }

            bufferedInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
