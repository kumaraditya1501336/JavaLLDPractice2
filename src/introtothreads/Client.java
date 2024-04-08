package introtothreads;

public class Client {
    public static void main(String[] args) {
        System.out.println("DEBUG");
        System.out.println(Thread.currentThread().getName());
        doSomething();
    }

    private static void doSomething() {
        System.out.println(Thread.currentThread().getName());
    }
}
