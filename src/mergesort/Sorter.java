package mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {

    private List<Integer> arraySort;

    private ExecutorService executorService;

    public Sorter (List<Integer> arr, ExecutorService executorService) {

        arraySort = arr;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        if (arraySort.size() <= 1) {
            return arraySort;
        }

        int mid = arraySort.size() / 2;

        List<Integer> leftArr = new ArrayList<>();

        for (int i = 0; i < mid; i++) {
            leftArr.add(arraySort.get(i));
        }

        List<Integer> rightArr = new ArrayList<>();
        for (int i = mid; i < arraySort.size(); i++) {
            rightArr.add(arraySort.get(i));
        }

        Sorter leftSorter = new Sorter (leftArr, executorService);
        Sorter rightSorter = new Sorter(rightArr, executorService);

        Future<List<Integer>> leftSortedArrayFuture = executorService.submit(leftSorter);
        Future<List<Integer>> rightSortedArrayFuture = executorService.submit(rightSorter);

        int i = 0;
        int j = 0;

        List<Integer> sortedArray = new ArrayList<>();

        List<Integer> leftSortedArray = leftSortedArrayFuture.get();
        List<Integer> rightSortedArray = rightSortedArrayFuture.get();

        while (i < leftSortedArray.size() && j < rightSortedArray.size()) {
            if (leftSortedArray.get(i) < rightSortedArray.get(j)) {
                sortedArray.add (leftSortedArray.get(i));
                i++;
            }
            else {
                sortedArray.add (rightSortedArray.get(j));
                j++;
            }
        }

        while (i < leftSortedArray.size()) {
            sortedArray.add (leftSortedArray.get(i));
            i++;
        }

        while (j < rightSortedArray.size()) {
            sortedArray.add (rightSortedArray.get(j));
            j++;
        }

        return sortedArray;
    }
}
