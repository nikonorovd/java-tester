package ru.neolant.addressbook.tests.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.neolant.addressbook.tests.model.ContactData;

import java.util.List;

public class ContactsCreationTests extends TestBase{


    @Test
    public void testContactsCreation() throws Exception {
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getNavigationHelper().gotoAddNew();
        app.getContactHelper().createContact(new ContactData("first name", "middle name", "last name",
                "company", "Titova", "1212121", "555666", "info@info.ru", "test1"),true);
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() + 1);

    }

}
