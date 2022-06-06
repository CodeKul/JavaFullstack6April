package multithreading;

public class ThreadMethods {

    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName());

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t2.setName("Test");
//        t2.join();
        System.out.println(t2.getId());
        System.out.println(t2.getName());
        t2.start();
    }
}
