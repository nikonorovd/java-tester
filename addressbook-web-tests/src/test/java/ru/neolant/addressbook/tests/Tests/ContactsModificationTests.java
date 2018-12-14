package ru.neolant.addressbook.tests.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import ru.neolant.addressbook.tests.model.ContactData;

public class ContactsModificationTests extends TestBase{
    private WebDriver wd;


    @Test
    public void testContactsModification() throws Exception {

        app.getContactHelper().selectContact();
        app.getContactHelper().editContact();
        app.getContactHelper().fillGroupFormContacts(new ContactData("first name", "middle name", "last name", "company", "Titova", "1212121", "555666", "info@info.ru"));
        app.getContactHelper().updateContacts();
        app.getContactHelper().returnToHomePage();

    }

}
