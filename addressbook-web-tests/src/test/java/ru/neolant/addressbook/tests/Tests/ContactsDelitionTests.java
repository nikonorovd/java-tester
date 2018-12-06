package ru.neolant.addressbook.tests.Tests;

import org.testng.annotations.Test;

public class ContactsDelitionTests extends TestBase {


    @Test
    public void testContactsDelitionTests() throws Exception {
        app.selectContact();
        app.deleteSelectedContacts();

    }


}
