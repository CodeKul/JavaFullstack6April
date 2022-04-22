package abstraction.abstractdemo;

import abstraction.interfacedemo.Operation2;

public class Football extends AbsSport  implements Operation2 {
    @Override
    public void play() {
        System.out.println("Playing football");
    }

//    @Override
//    public void exercise() {
//        System.out.println("Football exercise");
//    }

    public static void main(String[] args) {
        Football obj = new Football();
        obj.play();
//        obj.exercise();
    }

    @Override
    public void add(int a, int b) {

    }
}
