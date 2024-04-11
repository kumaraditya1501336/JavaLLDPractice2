package mergesort;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Sorter implements Callable<List<Integer>> {

    private List<Integer> arraySort;

    public Sorter (List<Integer> agr) {
        arraySort = agr;
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

        Sorter leftSorter = new Sorter (leftArr);
        Sorter rightSorter = new Sorter(rightArr);

        List<Integer> leftSortedArray = leftSorter.call();
        List<Integer> rightSortedArray = rightSorter.call();

        int i = 0;
        int j = 0;

//        List<Integer> sortedArray =
        return null;
    }
}
