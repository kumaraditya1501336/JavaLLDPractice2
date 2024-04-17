package genericsmethods;

public class Client {
    public static void main(String[] args) {
        Pair.<String, Integer>doSomething("ab", 1);
        Pair.doSomething("abc", 2);

        Integer s = Pair.doSomething("a", 1);


//        Pair<String, Integer> pair = new Pair<>();
//        pair.<Integer>doSomething(10);
//        pair.doSomething(15);

        Pair<String, String> pair2 = new Pair<>();
        Integer i = pair2.doSomething2("a", 1);

        Pair<String, String> pair3 = new Pair<>();
        String s2 = pair3.doSomething3("akshb");

        int i2 = 1;
        Integer i3 = i2;
    }
}
