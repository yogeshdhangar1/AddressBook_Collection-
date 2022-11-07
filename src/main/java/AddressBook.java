import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        Person.uniqueData();
        System.out.println("Search Result to show multiple person in the city or state");
     Person.searchPersonInCity("Pune");
     Person.sortAphabeticallyByPersonName();
    }
}



