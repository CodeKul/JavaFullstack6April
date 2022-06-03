package multithreading;

public class AnnonymousInnerClass {
    public static void main(String[] args) {

        MyInterface1 myInterface1 = new MyInterface1() {
            @Override
            public void show() {
                System.out.println("In show");
            }

            @Override
            public void display() {

            }
        };

        myInterface1.show();

    }
}

interface MyInterface1{

    void show();

    void display();
}