package abstraction.abstractdemo;

public class Tenis extends AbsSport{
    @Override
    public void play() {
        System.out.println("Playing Tenis");

    }

}

/**
 *           abstract class                               interface
 *
 * abstract class have both method abstract       interface have only abstract method(java 8-> default and static)
 * and non-abstract
 *
 * abstract class private .protected and public  interface have only public methods(java 9 -> private)
 * methods
 *
 * abstract class can extends another class or   interface can extends another interface
 * implements interface
 *
 * partial abstraction                           100% abstraction
 *
 */