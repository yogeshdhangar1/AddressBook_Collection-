import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AddressBook {
    static List<Person> personList = new ArrayList<Person>(); 
    public static void main(String[] args) {
        System.out.println("Welcome To AddressBook Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Press \n 1.AddNew \n 2.EditNumberContact \n 3.deleteFunction \n 4.display \n 5.exit");
        boolean t = true;
        while(t){
            int value = sc.nextInt();
            if(value == 1){
                AddNew();
            }
            if(value==2){

               Person. EditNumberContact();
            }
            if(value==3){
                Person.deleteFunction();
            }
            if(value==4){
                display();
            }
            if(value == 5){
                t = false;
            }
        }
    }
    private static void display() {
        System.out.println(personList);
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
      Person pr = new Person(Name,Email,City,Email,Zip,Number);
      personList.add(pr);
    }
}
