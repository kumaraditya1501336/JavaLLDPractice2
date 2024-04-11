package executorintro;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
//        Executor executor = Executors.newFixedThreadPool(20);

//        Executor executor = Executors.newCachedThreadPool();
        ExecutorService executorService = Executors.newFixedThreadPool(20);

        for (int i = 1; i <= 100; i++) {
            if (i == 5 || i == 12 || i == 15 || i == 75) {
                System.out.println("DEBUG");
            }
            NumberPrinter numberPrinter = new NumberPrinter(i);
//            executor.execute(numberPrinter);
            executorService.execute(numberPrinter);
        }

        executorService.shutdown();
    }
}
