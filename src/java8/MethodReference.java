package java8;

interface MyInterface6 {

    String show();
}

public class MethodReference {
    public static void main(String[] args) {

        //method ref to instance method
        MethodReference obj = new MethodReference();

        //refer
        MyInterface6 myInterface6 = obj::display;

        System.out.println(myInterface6.show());
    }

    String display() {
        return "in display";
    }

}