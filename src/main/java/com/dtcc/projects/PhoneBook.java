package com.dtcc.projects;

import java.util.*;

public class PhoneBook {
    private String name;
    private String phoneNumber;
    private int numbers;

    Map<String, List<String>> phoneBookMap;
    Scanner input = new Scanner(System.in);

    public PhoneBook(){
     this(new LinkedHashMap<String, List<String>>());
    }

    public PhoneBook(Map<String, List<String>> map){
        this.phoneBookMap = map;
    }

    public void add(String name, String phoneNumber) {
        List<String> phoneNumberList = phoneBookMap.get(name);
        if (phoneNumberList != null) {
            phoneNumberList.add(phoneNumber);
        } else {
            phoneBookMap.put(name, Collections.singletonList(phoneNumber));
        }
    }

    public void addAll(String name, String[] phoneNumbers){
        phoneBookMap.put(name, Arrays.asList(phoneNumbers));
    }
    public void remove(String name){
        phoneBookMap.remove(name);
    }

    public boolean hasEntry(String name){
        return phoneBookMap.containsKey(name);
    }

    public List<String> lookup(String name){
        return phoneBookMap.get(name);
    }

    public String reverseLookup(String phoneNumber){
        phoneBookMap.get(phoneNumber);
        return phoneNumber;
    }

    public String getAllContactNames(){
        List<String> phoneBook = new ArrayList<>();
        for(int i = 0; i < phoneBook.size(); i++){
           phoneBookMap.get(phoneBook.get(i));
        }
        return name;
    }
}