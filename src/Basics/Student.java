package Basics;

public class Student {
    private int id;
    private String name;
    private int roll;
    private Address address;
    private Level level;

    public Student(int id, String name, int roll) {
        this.id = id;
        this.name = name;
        this.roll = roll;
    }

    public Student(int id, String name, int roll, Address address) {
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.address = address;
    }

    public Student(int id, String name, int roll, Address address, Level level) {
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.address = address;
        this.level = level;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id= " + id +
                ", name= '" + name + '\'' +
                ", roll= " + roll +
                ", address= " + address +
                ", level= " + level +
                '}';
    }
}
