package overriding;

public class C extends A {
    @Override
    public void doSomething(String s) {
        System.out.println("From C " + s);
    }
}
