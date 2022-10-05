import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    static List<Person> personList = new ArrayList<Person>(); 
    public static void main(String[] args) {
        System.out.println("Welcome To AddressBook Program");
        CreateContact();
        display();
        
    }

    private static void display() {
        System.out.println(personList);
    }

    private static void CreateContact() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The Name");
        String Name = sc.nextLine();
        System.out.println("Enter the Address");
        String Address = sc.nextLine();
        System.out.println("Enter The City ");
        String City = sc.nextLine();
        System.out.println("Enter the Email ");
        String Email = sc.nextLine();
        System.out.println("Enter the Number");
        int Number = sc.nextInt();
        System.out.println("Enter The Zip Code ");
        int Zip = sc.nextInt();
      Person pr = new Person(Name,Email,City,Email,Zip,Number);
      personList.add(pr);
    }
}
