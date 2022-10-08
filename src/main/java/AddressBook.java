import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AddressBook {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<Person>();
        System.out.println("Welcome To AddressBook Program");
        Scanner sc = new Scanner(System.in);
        Person pr1 = new Person("Yogesh","wagholi","Pune","Yogesh@123",2345,2345667);
        Person pr2 = new Person("Nitin","weuuue","xyz","nitin@123",7886,65567);
        Person pr3 = new Person("Mayur","Nyz","Abc","mayur@123",665467,776544);
        personList.add(pr1);
        personList.add(pr2);
        personList.add(pr3);
        System.out.println(personList);


    }
}
