import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Person {
    static HashMap<String, String> map = new HashMap<String, String>();
    static Scanner sc = new Scanner(System.in);

    public static void uniqueData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Name");
        String name = sc.next();
        System.out.println("Enter The Number");
        int number = sc.nextInt();
        System.out.println("Enter The Address");
        String Address = sc.next();
        System.out.println("Enter The Mail");
        String email = sc.next();
        System.out.println("Enter The City");
        String city = sc.next();

    }

    public static String newAddressBookEnter() {
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

    public static void searchPersonInCity(String city) {
        //  initiating the value and "count" value use for the NO PERSON PRESENT IN CITY
        String str;
        String[] arrOfStr;
        int count = 0;
        //  for loop for HASHMAP
        Set<String> keys2 = map.keySet();
        for (Object key : keys2) {
            str = map.get(key);
            arrOfStr = str.split(" ", 4);
            for (String temp : arrOfStr) {
                //System.out.println(a);
                if (temp.equals(city)) {
                    System.out.println("Keys :  " + key + " value:  " + str);
                    //  Split The HashMAP Value Pair
                    arrOfStr = str.split(" ", 4);
                    for (String t : arrOfStr) {
                        // splittd Value will be compare to the City
                        if (temp.equals(city)) {
                            System.out.println("Keys :  " + key + " value:  " + str);
                            count++;
                        }
                    }
                }
            }
            // count will null it means No One Available in City
            if (count == 0)
                System.out.println("No Deails available");
        }
        System.out.println(count+"  number of person stay in the "+city);
        // count will null it means No One Available in City
        if (count==1)
            System.out.println("one contact available");

    }
    public static void sortAphabeticallyByPersonName() {
        map.keySet().stream().sorted((a1, a2) -> a2.compareTo(a1)).forEach(x -> System.out.println(x));

    }

}

