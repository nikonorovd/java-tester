package ru.neolant.addressbook.tests.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.neolant.addressbook.tests.model.ContactData;

import java.util.List;

public class ContactsDeletionTests extends TestBase {


    @Test
    public void testContactsDeletion() throws Exception {
        app.getNavigationHelper().gotoAddNew();
        if (!app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("first name", "middle name", "last name",
                    "company", "Titova", "1212121", "555666", "info@info.ru", "test1"), true);
        }
        List<ContactData> before = app.getContactHelper().getContactList();
            app.getContactHelper().selectContact(before.size() -1);
        app.getContactHelper().deletionContact();
        app.getContactHelper().returnToHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() - 1);
    }

}
