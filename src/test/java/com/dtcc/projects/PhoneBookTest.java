package com.dtcc.projects;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PhoneBookTest {
    @Test
    public void addTest(){
        PhoneBook phoneBook = new PhoneBook();
        String name = "Lolu";
        String phoneNumber = "2405793527";
        phoneBook.add(name, phoneNumber);
        Assert.assertTrue(phoneBook.phoneBookMap.containsKey(name));
        Assert.assertEquals(phoneNumber, phoneBook.phoneBookMap.get(name).get(0));
    }
    @Test
    public void addAllTest(){
        //Given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Charu";
        String[] strNum = {"357980865", "446789908", "3456677878"};
        //When
        phoneBook.addAll(name, strNum);
        //Then
        Assert.assertEquals(Arrays.asList(strNum), phoneBook.phoneBookMap.get(name));
    }

    @Test
    public void removeTest(){
        //Given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Lolu";
        String phoneNumber = "2405793527";
        phoneBook.add(name, phoneNumber);

        String name1 = "mide";
        String phoneNumber1 = "2405794567";
        phoneBook.add(name1, phoneNumber1);

        //When
        phoneBook.remove("mide");
        //Then
        Assert.assertFalse(phoneBook.phoneBookMap.containsKey("mide"));
    }

    @Test
    public void hasEntryTest(){
        //Given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Lolu";
        String phoneNumber = "2405793527";
        phoneBook.add(name, phoneNumber);

        String name1 = "mide";
        String phoneNumber1 = "2405794567";
        phoneBook.add(name1, phoneNumber1);

        //When
        phoneBook.hasEntry("Lolu");
        //Then
        Assert.assertTrue(phoneBook.phoneBookMap.containsKey("Lolu"));
    }

    @Test
    public void lookupTest(){
        //Given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Lolu";
        String phoneNumber ="357980865";
        phoneBook.add(name, phoneNumber);

        phoneBook.lookup("Lolu");
        Assert.assertEquals(Arrays.asList(phoneNumber), phoneBook.phoneBookMap.get(name));
    }

    @Test
    public void reverseLookupTest(){
        //Given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Lolu";
        String phoneNumber ="357980865";
        phoneBook.add(name, phoneNumber);

        phoneBook.lookup("Lolu");
        Assert.assertEquals(Arrays.asList(phoneNumber), phoneBook.phoneBookMap.get(name));
    }

    @Test
    public void getAllContactName(){
        PhoneBook book = new PhoneBook();
        String name = "Lolu";
        String phoneNumber = "2405793527";
        book.add(name, phoneNumber);

        String name1 = "mide";
        String phoneNumber1 = "2405794567";
        book.add(name1, phoneNumber1);
        book.getAllContactNames();

        
    }
}
