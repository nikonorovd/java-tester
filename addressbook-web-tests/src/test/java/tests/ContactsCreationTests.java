package tests;


import org.testng.annotations.*;
import modelcontacts.AddNewData;


public class ContactsCreationTests extends ContacsBase {

    @Test
    public void testContacts() {

        contactsM.gotoNewPage();
        contactsM.fillAddNewForm(new AddNewData("name", "leen", "keet", "nnn", "art", "Lenina1", "08", "07", "06"));
        contactsM.submitAddNew();
        contactsM.returnAddNew();
        contactsM.logout();
    }

}
