package mergesort_2;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arr = List.of(1, 2, 5, 10, 4, 3, 11, 15, 18, 21);

        ExecutorService executorService = Executors.newCachedThreadPool();

        Sorter sorter = new Sorter(arr, executorService);

        Future<List<Integer>> listFuture = executorService.submit(sorter);

        List<Integer> sorterArray = listFuture.get();

        for (Integer i : sorterArray) {
            System.out.print(i + " ");
        }

    }
}
