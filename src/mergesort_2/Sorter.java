package mergesort_2;

import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {

    private List<Integer> arrayToSort;
    private ExecutorService executorService;

    public Sorter (List<Integer> arrayToSort, ExecutorService executorService) {
        this.arrayToSort = arrayToSort;
        this.executorService = executorService;
    }
    @Override
    public List<Integer> call() throws Exception {

        if (arrayToSort.size() <= 1) {
            return arrayToSort;
        }

        int mid = arrayToSort.size() / 2;

        List<Integer> leftArrayToSort = new ArrayList<>();
        List<Integer> rightArrayToSort = new ArrayList<>();

        for (int i = 0; i < mid; i++) {
            leftArrayToSort.add (arrayToSort.get (i));
        }

        for (int i = mid; i < arrayToSort.size(); i++) {
            rightArrayToSort.add (arrayToSort.get (i));
        }

        Sorter leftArraySorter = new Sorter(leftArrayToSort, executorService);
        Sorter rightArraySorter = new Sorter(rightArrayToSort, executorService);

        Future<List<Integer>> leftArrayFuture = executorService.submit(leftArraySorter);
        Future<List<Integer>> rightArrayFuture = executorService.submit(rightArraySorter);

        List<Integer> sortedArray = new ArrayList<>();
        int i = 0;
        int j = 0;

        List<Integer> leftSortedArray = leftArrayFuture.get();
        List<Integer> rightSortedArray = rightArrayFuture.get();

        while (i < leftSortedArray.size() && j < rightSortedArray.size()) {
            if (leftSortedArray.get(i) < rightSortedArray.get(j)) {
                sortedArray.add(leftSortedArray.get(i++));
            }
            else {
                sortedArray.add(rightSortedArray.get(j++));
            }
        }

        while (i < leftSortedArray.size()) {
            sortedArray.add(leftSortedArray.get(i++));
        }

        while (j < rightSortedArray.size()) {
            sortedArray.add(rightSortedArray.get(j++));
        }

        return sortedArray;
    }
}
