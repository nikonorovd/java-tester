package ru.neolant.addressbook.tests;


import org.testng.annotations.*;
import modelcontacts.AddNewData;
import ru.neolant.addressbook.tests.ContacsBase;


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
