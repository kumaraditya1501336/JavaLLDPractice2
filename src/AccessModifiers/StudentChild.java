package AccessModifiers;

public class StudentChild extends Student {

    public void doSomething () {
        name = "Aditya";
        age = 20;
        psp = 5.0;
//        univName = "abc";   --> Wont work bcoz private
    }
}
