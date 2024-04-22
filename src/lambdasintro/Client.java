package lambdasintro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Printing from another thread from Lambda expression");
        });

        thread.start();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(19);
        list.add(6);
        list.add(15);
        list.add(6);
        list.add(5);

        System.out.println(list);

        Collections.sort(list, (Integer a, Integer b) -> {
            return b - a;
        });

        System.out.println(list);

        Collections.sort(list, (a, b) -> {
            return a - b;
        });

        System.out.println(list);

        Collections.sort(list, (a, b) -> b - a);

        System.out.println(list);

        List<Double> list1 = new ArrayList<>();
        list1.add(1.0);
        list1.add(19.0);
        list1.add(6.5);
        list1.add(15.6);
        list1.add(6.1);
        list1.add(5.5);

        System.out.println(list1);

        Collections.sort(list1, (Double a, Double b) -> {
            return Double.compare(b, a);
        });

        System.out.println(list1);

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(() -> {
            return 1;
        });
    }
}
