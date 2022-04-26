package constructor;

/**
 * constructor -> it is special type of function which automatically invoke when object of
 * class is created
 *
 * Rules->
 * 1 .your class name and Constructor name should be same
 * 2 .there should be no return type to Constructor
 * 3 .you can not use static, final ,synchronized with Constructor
 *
 * Types ->
 * 1. default Constructor
 * 2. parameterized Constructor
 *
 * use -> Constructor initialized variables to their default values
 */
public class ConstructorDemo {

    int id;
    String name;
    String address;

    ConstructorDemo(){
        System.out.println("In Constructor");
    }

    public ConstructorDemo(int i){
        System.out.println("In Constructor "+i);
    }

    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo();
        ConstructorDemo obj1 = new ConstructorDemo(2);
        obj.id = 1;
        obj.name = "akash";
        obj.address = "Pune";
    }
}
