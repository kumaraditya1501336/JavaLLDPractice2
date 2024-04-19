package comaprableandcomparator;

import java.util.Comparator;

public class MileageComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.milege - o2.milege;
    }
}
