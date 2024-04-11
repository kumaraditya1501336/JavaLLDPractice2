package executorintro;

public class NumberPrinter implements Runnable {

    private int num ;

    public NumberPrinter(int n) {
        num = n;
    }
    @Override
    public void run() {
        System.out.println("Printing " + num +
                " from " +
                Thread.currentThread().getName());
    }
}
