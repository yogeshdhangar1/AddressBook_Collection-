import java.util.Scanner;

public class Person {
    String Name ;
    String Address;
    String City;
    String Email;
    int zip;
    int Number ;

    public Person(String name, String address, String city, String email, int zip, int number) {
        Name = name;
        Address = address;
        City = city;
        Email = email;
        this.zip = zip;
        Number = number;
    }
    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", City='" + City + '\'' +
                ", Email='" + Email + '\'' +
                ", zip=" + zip +
                ", Number=" + Number +
                '}';
    }
}
