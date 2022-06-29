package java8;

public class MethodRefToStatic {
    public static void main(String[] args) {
        MyInterface8 myInterface8 = MethodRefToStatic::display;
        myInterface8.show();
    }

    static void display(){
        System.out.println("static ");
    }
}

interface MyInterface8{
    void show();
}