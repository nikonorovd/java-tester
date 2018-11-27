package tests;

import contactsmanager.ContactsManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ContacsBase {

    protected final ContactsManager contactsM = new ContactsManager();

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        contactsM.init();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        contactsM.stop();
    }

    public ContactsManager getContactsM() {
        return contactsM;
    }
}
