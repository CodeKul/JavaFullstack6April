package package1;

public class Test1 {

   protected int i = 10;

    public void show(){
        System.out.println("In show");
    }

    public static void main(String[] args) {

        Test1 obj = new Test1();
        System.out.println(obj.i);
    }

}

/**
 *
 * access specifier or access modifier
 *
 * private -> private is accessible within class
 *
 * default -> default is accessible within package only, it is more restrictive than protected
 *
 * protected -> protected  is accessible within package and outside the package through inheritance
 *
 * public -> public is accessible throughout project
 *
 *
 */