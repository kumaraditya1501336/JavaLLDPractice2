package overriding;

public class B extends A {
    @Override
    public void doSomething (String s) {
        System.out.println("From B " + s);
    }
}
