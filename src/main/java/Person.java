import java.util.Scanner;
import java.util.zip.ZipEntry;

public class Person {
    static String Name ;
    static String Address;
    static String City;
    static String Email;
   static  int zip;
    static int Number ;

    public Person(String name, String address, String city, String email, int zip, int number) {
        Name = name;
        Address = address;
        City = city;
        Email = email;
        zip = zip;
        Number = number;
    }
    static  void EditNumberContact(){
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        String Name = sc.nextLine();
        System.out.println("Enter The Address");
        String Address = sc.nextLine();
        System.out.println("Enter The City");
        String City = sc.nextLine();
        System.out.println("Enter The Email");
        String Email = sc.nextLine();
        System.out.println("Enter The Zip Code");
        int zip = sc.nextInt();
        System.out.println("Enter The Number");
        int number = sc.nextInt();
    }
    public static  void deleteFunction(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Name");
        String name = sc.nextLine();
        if(Name.equals(name)){
             Name = null;
            Address = null;
            Email = null;
            City = null;
            zip = 0;
            Number = 0;
        }
    }
    private static void AddNew() {
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
