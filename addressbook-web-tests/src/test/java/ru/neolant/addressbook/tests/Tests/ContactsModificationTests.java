package ru.neolant.addressbook.tests.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import ru.neolant.addressbook.tests.model.ContactData;

public class ContactsModificationTests extends TestBase{
    private WebDriver wd;


    @Test
    public void testContactsModification() {
        app.getNavigationHelper().gotoAddNew();
        if (!app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("first name", "middle name", "last name",
                    "company", "Titova", "1212121", "555666", "info@info.ru", "test1"),true);
        }
        app.getContactHelper().editContact();
        app.getContactHelper().fillContactsForm(new ContactData("first name", "middle name", "last name", "company", "Titova", "1212121", "555666", "info@info.ru", null),false);
        app.getContactHelper().updateContacts();
        app.getContactHelper().returnToHomePage();

    }

}
