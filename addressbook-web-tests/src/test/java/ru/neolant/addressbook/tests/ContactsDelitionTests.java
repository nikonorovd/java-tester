package ru.neolant.addressbook.tests;

import org.testng.annotations.Test;

public class ContactsDelitionTests extends TestBase {


    @Test
    public void testContactsDelitionTests() throws Exception {
        selectContact();
        deleteSelectedContacts();
        returnToHomePage();

    }


}
