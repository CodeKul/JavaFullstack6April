package filehandling;

import java.io.File;
import java.io.IOException;

public class FileMethods {
    public static void main(String[] args) throws IOException {

        File file = new File("demo.txt");
        boolean flag = file.createNewFile();
        System.out.println(flag);

        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.isFile());
        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.exists());
        System.out.println(file.getCanonicalPath());
        System.out.println(file.isDirectory());

        File file1 = new File("newdir");
        file1.mkdir();

        System.out.println(file.length());
    }
}
