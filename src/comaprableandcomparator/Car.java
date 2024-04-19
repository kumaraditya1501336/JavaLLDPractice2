package comaprableandcomparator;

public class Car implements Comparable<Car> {

    public int topSpeed;

    public int milege;

    public int acceleration;

    public Car(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public Car(int topSpeed, int milege) {
        this.topSpeed = topSpeed;
        this.milege = milege;
    }

    @Override
    public int compareTo(Car o) {
//        if (this.topSpeed < o.topSpeed) {
//            return -1;
//        }
//        else if (this.topSpeed > o.topSpeed) {
//            return 1;
//        }
//        else return 0;


//        return this.topSpeed - o.topSpeed;

        if (this.topSpeed == o.topSpeed) {
            return this.milege - o.milege;
        }
        else {
            return this.topSpeed - o.topSpeed;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "topSpeed=" + topSpeed +
                ", milege=" + milege +
                ", acceleration=" + acceleration +
                '}';
    }
}
