package multithreading;

public class AnnonymousInnerClass {
    public static void main(String[] args) {

        MyInterface1 myInterface1 = ()-> {
                System.out.println("In show");


        };

        myInterface1.show();

    }
}

interface MyInterface1{

    void show();

}