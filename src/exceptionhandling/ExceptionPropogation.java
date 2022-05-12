package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExceptionPropogation {

    private void a() throws FileNotFoundException {
//        int i = 10/0;
        FileOutputStream fileOutputStream = new FileOutputStream("text.txt");
    }

    private void b() throws FileNotFoundException{
        a();
    }

    private void c(){
        try {
            b();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        ExceptionPropogation obj = new ExceptionPropogation();
        obj.c();

    }
}
