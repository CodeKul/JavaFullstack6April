package multithreading;

public class RunnableDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("in run method");
    }

    public static void main(String[] args) {
        RunnableDemo r = new RunnableDemo();
//        runnable.run();//this is wrong
        Thread t1 = new Thread(r);
        t1.start();
    }
}
