package listgenerics;

import java.util.List;

public class Test<T> {
    public static void doSomething (List<Animal> animals) {

    }

    //
    public static void doSomething2 (List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
