package overriding;

public class Client {
    public static void main(String[] args) {
        A a = new A();
        a.doSomething("skdfjvb");

        B b = new B();
        b.doSomething("sdfvkj b");

        A a1 = new B();
        a1.doSomething("aditya");

        A obj = new C();
        obj.doSomething("Kumar");

    }
}
