package main;

class Address{
    private String street;
    private String city;
    private String state;
    private int zipCode;

    public Address(String street, String city, String state, int zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}

class Employee{

    private String fistName;
    private String lastName;
    private Address address;

    public Employee(String fistName, String lastName, Address address) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}';
    }
}
public class Aggregation_Implementation {
    public static void main(String[] args) {

        Address address1 = new Address("Ravi Nagar", "Nagpur", "MAHARASHTRA", 441401);
        Address address2 = new Address("laxmi Nagar", "Madhapur", "HYDERABAD", 500100);
        Employee employee1 = new Employee("suraj", "Bade", address1);
        Employee employee2 = new Employee("rahul", "kachave", address2);

        System.out.println(employee1.getFistName());
        System.out.println(employee1.getLastName());
        System.out.println(employee1.getAddress().getStreet());
        System.out.println(employee1.getAddress().getCity());
        System.out.println(employee1.getAddress().getState());
        System.out.println(employee1.getAddress().getZipCode());

        System.out.println(employee2);

    }

    // Aggregation is a type of association that represents a "has-a" relationship,
    // where one class contains or owns one or more instances of another class.
    // The contained objects can exist independently of the containing object, and can be shared among multiple containing objects.
    // Aggregation is a weaker form of composition.


}
