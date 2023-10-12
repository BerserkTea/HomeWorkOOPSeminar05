package org.example;

import java.util.ArrayList;
import java.util.List;

import static org.example.View.ScanString;

public class PhoneBook {
    List<Contact> phoneBook;

    public PhoneBook() {
        this.phoneBook = new ArrayList<Contact>();
    }

    public void addContact() {
        View.printSimpleMessage(View.inputNewContact);
        this.phoneBook.add(new Contact(ScanString(), ScanString(), ScanString()));
        View.printSimpleMessage(View.succesfulAdded);
    }

    /**
     * Создал что бы вызывать его из других мест
     *
     * @param s
     * @param s1
     * @param s2
     */
    public void addContact(String s, String s1, String s2) {
        this.phoneBook.add(new Contact(s, s1, s2));
    }

    public void findContact(PhoneBook phoneBook) {
        View.printSimpleMessage(View.inputSearchWord);
        String whatToFind = ScanString();
        for (Contact contact : phoneBook.phoneBook) {
            if (contact.getPhone().equals(whatToFind) || contact.getName().equals(whatToFind) || contact.getComment().equals(whatToFind)) {
                System.out.println(contact);
            }
        }
    }

    /**
     * Метод для изменения контакта в книге.
     * @param phoneBook
     * @return исправленую книгу, я надеюсь.
     */
    public PhoneBook editContact(PhoneBook phoneBook) {
        View.showBook(phoneBook);
        View.printMessage(View.inputEditContactID);
        int tempInt = View.ScanInt()-1;
        Contact contact = phoneBook.phoneBook.get(tempInt).changeContact();
        return phoneBook;
    }

    public PhoneBook deleteContact(PhoneBook phoneBook){
        View.showBook(phoneBook);
        View.printSimpleMessage(View.inputEDelContactID);
        try {phoneBook.phoneBook.remove(View.ScanInt() - 1);
            View.printMessage(View.succesfulDeleted);
        }
        catch (Exception e) {
            View.printMessage(View.simpleError);
            throw new RuntimeException(e);
        }
        return phoneBook;
    }
}
