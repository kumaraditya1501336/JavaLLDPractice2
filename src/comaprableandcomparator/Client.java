package comaprableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();

        carList.add(new Car(100));
        carList.add(new Car(200));
        carList.add(new Car(500));
        carList.add(new Car(10));
        carList.add(new Car(50));

//        Collections.sort(carList);
//
//        System.out.println(carList);

        List<Car> carList1 = new ArrayList<>();

        carList1.add(new Car(100, 10));
        carList1.add(new Car(200, 15));
        carList1.add(new Car(500, 5));
        carList1.add(new Car(10, 12));
        carList1.add(new Car(50, 16));

        Collections.sort(carList1, new MileageComparator());

        System.out.println(carList1);

        Car c1 = new Car(100, 10);
        Car c2 = new Car(50, 12);

        c1.compareTo(c2);

        MileageComparator mileageComparator = new MileageComparator();
        mileageComparator.compare(c1, c2);

    }
}
