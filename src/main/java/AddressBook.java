import java.util.*;
public class AddressBook {
    static HashMap<Integer, String> cont = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static String newAddressBookData() {
        System.out.println("Enter The Name");
        String Name = sc.nextLine();
        System.out.println("Enter The Address");
        String Address = sc.next();
        System.out.println("Enter The City");
        String City = sc.nextLine();
        System.out.println("Enter The Email");
        String Email = sc.nextLine();
        System.out.println("Enter The Pin Code Number");
        int zip = sc.nextInt();
        System.out.println("Enter The Number");
        int Number = sc.nextInt();
        System.out.println(Name + " " + Address + " " + City + " " + Email + " " + zip + " " + Number + " ");
        return " " + Name + " " + Address + " " + City + " " + Email + " " + zip + " " + Number + " ";
    }

    public  static void storeData() {
        System.out.println("If address book add more Then Enter The  1");
        System.out.println("If address book add Nothing Then Enter The  0");
        System.out.println("If address book Show Then Enter The  2");
        int condition = sc.nextInt();
        switch (condition) {

            case (0):
                System.out.println("Your address Book Is  Save & Closed");
                break;
            case (1):
                System.out.println("Enter The Unique Value of Person");
                int unique = sc.nextInt();
                cont.put(unique, newAddressBookData());
                System.out.println(cont.get(unique));
                storeData();
                break;
            case (2):
                Set<Integer> keys = cont.keySet();
                for (Object key : keys)
                    System.out.println("Keys :  " + key + " value:  " + cont.get(key));
                break;
            default:
                System.out.println("Enter Correct Input");
        }
    }
        public static void main (String[]args) {
            AddressBook.newAddressBookData();
        }
}
