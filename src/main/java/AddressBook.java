import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    public void WriteData() throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\intallije workplace\\AddressBookCollection\\AddressBook.csv.txt");
        CSVWriter csvWriter = new CSVWriter(fileWriter);
        List<String[]> data = new ArrayList<>();
        data.add(new String[]{"Name","Address","City","Email","Number"});
        data.add(new String[]{"Yogesh","Wagholi","pune","Abc@123","773636"});
        data.add(new String[]{"Bhavesh","nizar","Nandurbar","Xyz@123","376353"});
        data.add(new String[]{"Ketan","Thane","Mumbai","Ketan@123","6643"});
        csvWriter.writeAll(data);
        csvWriter.close();
    }
    public void ReadData() throws IOException, CsvException {
        FileReader filereader = new FileReader("C:\\intallije workplace\\AddressBookCollection\\AddressBook.csv.txt");
        // create csvReader object and skip first Line
        CSVReader csvReader = new CSVReaderBuilder(filereader).build();
        List<String[]> allData = csvReader.readAll();
        for (String[] row : allData) {
            for (String cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException, CsvException {
        AddressBook obj = new AddressBook();
        obj.WriteData();
        obj.ReadData();

    }
}
