package multithreading;

public class DeadLock {
    public static void main(String[] args) {

        String resource1 ="Printer";
        String resource2 = "Scanner";

        Thread laptop = new Thread(()->{
           synchronized (resource1){
               System.out.println("Laptop locked printer");
               try {
                   Thread.sleep(500);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }

               synchronized (resource2){
                   System.out.println("Laptop locked scanner");
               }
           }
        });

        Thread desktop = new Thread(()->{
            synchronized (resource2){
                System.out.println("Desktop locked scanner");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            synchronized (resource1){
                System.out.println("Desktop locked printer");
            }
        });

        laptop.setName("Laptop");
        desktop.setName("DeskTop");

        laptop.start();
        desktop.start();
    }
}
