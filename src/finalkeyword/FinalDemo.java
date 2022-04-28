package finalkeyword;

//final variable => you can not reassign the value to variable
//final method => you can not override the method
//final class => you can not inherit the class

public final class FinalDemo {

    final int i = 10;

    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
//        obj.show();
        System.out.println(obj.i);
    }

   final public void show() {
//        i = 30;
        System.out.println("In final show");
    }
}

//class A extends FinalDemo {
//
//    public void show() {
//        System.out.println("In A show");
//    }
//}