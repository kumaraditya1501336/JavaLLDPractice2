package Basics;

public class Address {
    private String flatNumber;
    private String street;
    private String area;
    private String city;
    private String state;

    public Address(String flatNumber, String street, String area, String city, String state) {
        this.flatNumber = flatNumber;
        this.street = street;
        this.area = area;
        this.city = city;
        this.state = state;
    }

    public Address() {
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "flatNumber= '" + flatNumber + '\'' +
                ", street= '" + street + '\'' +
                ", area= '" + area + '\'' +
                ", city= '" + city + '\'' +
                ", state= '" + state + '\'' +
                '}';
    }
}
