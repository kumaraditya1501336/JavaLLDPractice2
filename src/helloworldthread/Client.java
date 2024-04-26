package helloworldthread;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        helloWorldPrinter.run();

        Thread thread = new Thread(helloWorldPrinter);
        thread.start();

        System.out.println("Printing helloe2 world from : "
                + Thread.currentThread().getName());
    }
}
