package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OpenFile {
    public static PhoneBook openFile(){
        PhoneBook phoneBook = new PhoneBook();
        String filePath = View.ScanString();
        try (final java.io.FileReader fileReader = new FileReader("src/main/java/org/example/"+filePath+".txt")){
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()){
                String scanned = scanner.nextLine();
                if (!scanned.isEmpty()) {
                    List<String> tempString = Arrays.asList(scanned.split(","));
                    phoneBook.addContact(tempString.get(0),tempString.get(1),tempString.get(2));
                }
                fileReader.close();
            }
            View.printMessage(TextKeeper.loadSuccesful);
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            View.printMessage(TextKeeper.loadMenuError);
        }
        catch (IOException e) {
            View.printMessage(TextKeeper.loadMenuError);
            throw new RuntimeException(e);
        }
        return phoneBook;
    }
}
