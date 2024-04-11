package syncintro;

public class Client {
    public static void main(String[] args) {
        Count count = new Count();

        int count = 0;

        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);
    }
}
