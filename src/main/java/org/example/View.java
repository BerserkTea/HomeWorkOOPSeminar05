package org.example;

import java.util.Scanner;

public class View implements TextKeeper {
    public static void printMessage(String message){
        System.out.println(message);
        System.out.println("**************************");
    }
    public static void printSimpleMessage(String message){
        System.out.println(message);
    }

public static void showBook (PhoneBook book){
        if (book != null) {
            for (int i = 0; i < book.phoneBook.size(); i++) {
                System.out.printf("%d. %s\n", i+1, book.phoneBook.get(i));
            }
        }else printMessage(TextKeeper.emptyBookError);
}

    public static String ScanString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static int ScanInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
