package multithreading;

import java.io.Serializable;
import java.rmi.Remote;

public class RunnableDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("in run method");
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        RunnableDemo r = new RunnableDemo();
//        runnable.run();//this is wrong
        Thread t1 = new Thread(r);

        t1.start();
    }

}

//New - when you create object of thread and before invocation of start()
//Runnable - when invoke the start method but thread scheduler is not selected as running thread
//Running - when thread scheduler is selected as running thread
//Blocking - when it not eligible to run but still alive
//Dead - after exit of run method