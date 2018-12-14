package ru.neolant.addressbook.tests.Tests;

        import org.testng.annotations.Test;

public class ContactsDeletionTests extends TestBase {


    @Test
    public void testContactsDeletion() throws Exception {

        app.getContactHelper().selectContact();
        app.getContactHelper().deletionContact();

    }

}
