package ru.neolant.addressbook.tests.Tests;

import org.testng.annotations.Test;
import ru.neolant.addressbook.tests.model.ContactData;

public class ContactsCreationTests extends TestBase{


    @Test
    public void testContactsCreation() throws Exception {

        app.gotoAddNew();
        app.getGroupHelper().fillGroupFormContacts(new ContactData("first name", "middle name", "last name", "company", "Titova", "1212121", "555666", "info@info.ru"));
        app.getGroupHelper().submitContactsCreation();
        app.getGroupHelper().returnToHomePage();

    }

}
