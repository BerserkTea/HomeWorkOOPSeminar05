package org.example;

import java.io.FileWriter;
import java.io.IOException;

public interface SaveFile {
     static void saveTo(PhoneBook phoneBook){
            View.printSimpleMessage(View.enterFileName);
            String filePath = View.ScanString();
            try (FileWriter writer = new FileWriter("src/main/java/org/example/"+filePath+".txt",false)){
                for (Contact string : phoneBook.phoneBook) {
                    writer.write(string+"\n");
                    writer.write(System.lineSeparator());
                }
                writer.close();
                View.printMessage(View.saveSuccesful);
            }
            catch(IOException e) {
                System.out.println(e.getMessage());
                View.printMessage(TextKeeper.simpleError);
            }
    }
}
