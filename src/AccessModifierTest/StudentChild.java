package AccessModifierTest;

import AccessModifiers.Student;

public class StudentChild extends Student {
    public void doSomething () {
        name = "Aditya";
//        age = 20;     --> Wont work bcoz it has no access modifier and trying to modify in different package
        psp = 5.0;
//        univName = "abc";   --> Wont work bcoz private
    }
}
