package ru.neolant.addressbook.tests.Tests;

import org.testng.annotations.Test;
import ru.neolant.addressbook.tests.model.ContactData;

public class ContactsCreationTests extends TestBase{


    @Test
    public void testContactsCreation() throws Exception {

        app.getNavigationHelper().gotoAddNew();
        app.getContactHelper().createContact(new ContactData("first name", "middle name", "last name",
                "company", "Titova", "1212121", "555666", "info@info.ru", "test1"),true);

    }

}
