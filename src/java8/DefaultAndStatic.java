package java8;

public class DefaultAndStatic implements MyInterface4,MyInterface5 {
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

    @Override
    public int add(int i, int j) {
        return 0;
    }

    @Override
    public void display() {
        System.out.println("In display");
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

@FunctionalInterface
interface MyInterface5{

    int add(int i,int j);

    default void display(){
        System.out.println("In display");
    }
    int hashCode();

    String toString();

//    Object clone();
}