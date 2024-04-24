package exceptionointro;

import java.io.FileNotFoundException;

public class Client {
    public static void main(String[] args) throws FileNotFoundException {
        Student student = new Student();
//        int score = student.getScore();

//        student.readFile();

//        student.readFile2();

        System.out.println("The score is: " );

//        try {
//            test(); // exception occurs at this line
//            System.out.println("Just called test");
//        } catch (FileNotFoundException e) {
//            System.out.println("File could not be read");
//        }

//        test();

        student.test();

    }

    public static void test() throws FileNotFoundException {
        Student student = new Student();
        student.readFile2();  //  -> Exception thrown at this line
        System.out.println("Printing from test");
    }
}
