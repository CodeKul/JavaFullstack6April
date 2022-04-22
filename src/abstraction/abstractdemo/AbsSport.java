package abstraction.abstractdemo;

import abstraction.interfacedemo.Operation2;

public abstract class AbsSport {

    public abstract void play();//abstract method

    protected void exercise(){ //concrete method
        System.out.println("exercise");
    }
}
