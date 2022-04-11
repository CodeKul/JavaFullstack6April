package basic;
https://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@github.com/CodeKul/JavaFullStack10Feb.git
/**
 * public -> access modifier so jvm can access from outside
 * static -> without crating object of class jvm can access it.
 * void -> it returns nothing
 * main -> main is identifier and jvm looks for main to entry
 * String[] -> it is command line argument of type string
 * args -> it is a variable name
 * */

public class PSVMDemo {
     int i = 10;// member variable //data member
    String str = "Hello";

    public int show(int a,int b){ //member function
      return a+b;
    }

    private static void main(String[] args,Integer i) {

    }

    public static void main(String[] arg) {
        PSVMDemo obj = new PSVMDemo();
        System.out.println(obj.i);
        obj.show(3,4);

        System.out.println(arg[0]+" "+arg[1]);
    }
}
