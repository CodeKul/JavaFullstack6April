package thiskeyword;

/**
 * This keyword =>
 * 1. it refers the current class instance variable.
 * 2. it invokes the current class methods
 * 3. it invokes the constructor
 */
public class ThisDemo {

    int id;
    String name;
    String address;



    public void show(){
        System.out.println("In show method");
    }

    public void display(){
        this.show();
        System.out.println("In display method");
    }

    public ThisDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    private ThisDemo(){
        this(1,"Prakash","Pune");
        System.out.println("");
    }

    public static void main(String[] args) {
//        ThisDemo obj = new ThisDemo(1,"Prakash","Pune");

        ThisDemo obj1 = new ThisDemo();
        System.out.println(obj1.id+" "+ obj1.name+" "+obj1.address);

    }
}
