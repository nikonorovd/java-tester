package tests;


import org.testng.annotations.*;
import modelcontacts.AddNewData;


public class ContactsCreationTests extends ContacsBase {

    @Test
    public void testContacts() {

        contactsM.getContactsNavigationHelper().gotoNewPage();
        contactsM.getContactHelper().fillAddNewForm(new AddNewData("name", "leen", "keet", "nnn", "art", "Lenina1", "08", "07", "06"));
        contactsM.getContactHelper().submitAddNew();
        contactsM.getContactHelper().returnAddNew();
        contactsM.logout();
    }

}
