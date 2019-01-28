package ru.neolant.addressbook.tests.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.neolant.addressbook.tests.model.ContactData;

public class ContactsDeletionTests extends TestBase {


    @Test
    public void testContactsDeletion() throws Exception {
        int before = app.getContactHelper().getContactCount();
        if (!app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("first name", "middle name", "last name",
                    "company", "Titova", "1212121", "555666", "info@info.ru", "test1"), true);
        }
            app.getContactHelper().selectContact();
        app.getContactHelper().deletionContact();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before - 1);
    }

}
