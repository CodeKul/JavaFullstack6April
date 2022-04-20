package polymorphism;

/**
 * if parent and child class have same method with same signature
 */
public class Animal {
    public void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {

    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.sound();
    }

    public void sound() {
        System.out.println("Cat sound");
    }
}
