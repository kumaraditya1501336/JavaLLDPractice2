package Basics;

public class StudentMain {
    public static void main(String[] args) {
        Address address = new Address
                ("22", "Road No. 1", "Magistrate Colony", "Patna", "Bihar");

        Student student = new Student(1, "Aditya Kumar", 35, address, Level.STANDARD_10);

        System.out.println(student);

    }
}
