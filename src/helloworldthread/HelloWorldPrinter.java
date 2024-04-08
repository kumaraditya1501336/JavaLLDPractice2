package helloworldthread;

public class HelloWorldPrinter implements Runnable {
    @Override
    public void run() {
        System.out.println("Printing helloe world from : "
            + Thread.currentThread().getName());
    }
}
