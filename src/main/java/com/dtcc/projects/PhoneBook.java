package com.dtcc.projects;

import java.util.*;

public class PhoneBook {
    private String name;
    private String phoneNumber;

    HashMap<String, String> PhoneBook = new HashMap<>();
    Scanner input = new Scanner(System.in);

    public PhoneBook(){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void add(String name, String phoneNumber){
        PhoneBook.put(name, phoneNumber);
    }

    public void addAll(String name, String [] phoneNumbers){
        List<String> phonenumbers = new ArrayList<>();

      //  PhoneBook.putAll(phoneNumbers);
    }

    public void remove(String name){
        PhoneBook.remove(name);
    }
}