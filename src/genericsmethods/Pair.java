package genericsmethods;

public class Pair <K, V> {
    private K first;
    private V second;

    public void setFirst(K first) {
        this.first = first;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    //Placeholder at method level
    public static <T, S> S doSomething (T first, S second) {
        System.out.println(first);
        System.out.println(second);

        return second;
    }

    public <E, V> V doSomething2 (E val, V val2) {
        System.out.println(val);
        V test = val2;
        return test;
    }

    public <E, V> V doSomething3 (E val) {
        System.out.println(val);
        V test = (V) val;
//        return test;

        return (V) "sdkjv";
    }
}
