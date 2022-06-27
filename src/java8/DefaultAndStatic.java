package java8;

public class DefaultAndStatic implements MyInterface4 {
    public static void main(String[] args) {

        DefaultAndStatic obj = new DefaultAndStatic();
        obj.msg();
        obj.display();

        MyInterface4.show();

    }

    @Override
    public void msg() {
        System.out.println("in msg");
    }
}

interface MyInterface4{

    void msg();//declration

    default void display(){
        System.out.println("In display");
    }

    static void show(){
        System.out.println("In static method");
    }

}