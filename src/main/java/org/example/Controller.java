package org.example;

import java.util.Scanner;

public class Controller {

    public void searchContact(){

    }

    public void start(){
        View.printMessage(TextKeeper.firstTimeStart);
        View.printSimpleMessage(View.enterFileName);
        PhoneBook phoneBook = OpenFile.openFile();
        Scanner scanner = new Scanner(System.in);
        Boolean menuSwitch = true;
        while (menuSwitch){
            View.printMessage(TextKeeper.inputMenu);
            View.printMessage(TextKeeper.menu);
            switch (scanner.nextInt()) {
                case 1 -> {
                }
                case 2 -> phoneBook = phoneBook.deleteContact(phoneBook);
                case 3 -> SaveFile.saveTo(phoneBook);
                case 4 -> View.showBook(phoneBook);
                case 5 -> phoneBook.addContact();
                case 6 -> phoneBook.findContact(phoneBook);
                case 7 -> phoneBook = phoneBook.editContact(phoneBook);
                case 8 -> {
                    menuSwitch = false;
                    Controller controller = new Controller();
                    controller.start();
                }
                default -> {
                    menuSwitch = false;
                    View.printMessage(TextKeeper.exitProgramm);
                }
            }
        }
    }
}
