import java.util.Scanner;
public class Person {
    public  static void  uniqueData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Name");
        String name = sc.next();
        System.out.println("Enter The Number");
        int number = sc.nextInt();
        System.out.println("Enter The Address");
        String Address = sc.next();
        System.out.println("Enter The Mail");
        String email = sc.next();

    }
    public static String newAddressBookEnter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Name");
        String name = sc.next();
        System.out.println("Enter The Number");
        int number = sc.nextInt();
        System.out.println("Enter The Address");
        String Address = sc.next();
        System.out.println("Enter The Mail");
        String email = sc.next();
        return name;
    }
}
