package genericsintro;

public class Client {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>();
        pair.first = "Abc";
        pair.second = 1;
        pair.setFirst("AC");
        pair.setSecond(15);

        String s = pair.getFirst();
        Integer i = pair.getSecond();

        Pair<Integer, Integer> pair2 = new Pair<>();
        pair2.first = 1;
        pair2.second = 2;

    }
}
