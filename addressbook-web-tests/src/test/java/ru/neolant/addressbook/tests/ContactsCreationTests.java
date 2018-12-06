package ru.neolant.addressbook.tests;

import org.testng.annotations.Test;

public class ContactsCreationTests extends TestBase{


    @Test
    public void testContactsCreation() throws Exception {

        gotoAddNew();
        fillGroupFormContacts(new ContactData("first name", "middle name", "last name", "company", "Titova", "1212121", "555666", "info@info.ru"));
        submitContactsCreation();
        returnToHomePage();
    }

}
