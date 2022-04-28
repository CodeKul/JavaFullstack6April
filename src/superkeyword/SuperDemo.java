package superkeyword;

//it refers immediate parent class instance variable
//it invokes immediate parent class method.
//it invokes immediate parent class constructor.
public class SuperDemo {
    int i=10;

    public SuperDemo(){
        System.out.println("In super demo default");
    }

    public SuperDemo(int i){
        System.out.println("in parameter super demo");
    }

    public void show(){
        System.out.println("In parent show");
    }
}

class Sample extends SuperDemo{

    int i=20;

    public Sample(){
        super(4);
        System.out.println("In Sample constructor");
    }

    public void show(){
        super.show();
        System.out.println("In show "+super.i);
    }

    public static void main(String[] args) {
       Sample obj = new Sample();

    }
}