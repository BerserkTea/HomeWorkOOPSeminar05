package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

public class Contact{
//    HashMap<Integer,Contact>contactHashMap = new HashMap<Integer, Contact>(); //todo а надо ли? но хороши бы был уникальный ключ обращения
    private String name;
    private String phone;
    private String comment;

    public Contact(String name, String phone, String comment) {
        this.name = name;
        this.phone = phone;
        this.comment = comment;
    }
    public Contact changeContact(){
        View.printMessage(View.inputEditName);
        this.setName(View.ScanString());
        View.printMessage(View.inputEditPhone);
        this.setPhone(View.ScanString());
        View.printMessage(View.inputEditComment);
        this.setComment(View.ScanString());
        return this;
    }

    @Override
    public String toString() {
        return  name + "," + phone +"," + comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(phone, contact.phone) && Objects.equals(comment, contact.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, comment);
    }
}
