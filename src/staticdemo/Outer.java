package staticdemo;

public class Outer {

    int i= 30;

    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.i);

        Outer.Inner obj = outer.new Inner();//non static class
        System.out.println(obj.i);

//        Outer.Inner obj = new Inner();//for static class
//        System.out.println(obj.i);
    }

    private class Inner {
        int i = 90;
    }
}
