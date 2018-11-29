package ru.neolant.addressbook.tests;

import modelcontacts.AddNewData;
import org.testng.annotations.Test;
import ru.neolant.addressbook.tests.ContacsBase;

public class ContactsModificationTests extends ContacsBase {
    @Test
    public void testContactsModification() {

        contactsM.getContactsNavigationHelper().gotoNewPage();
        contactsM.getContactHelper().selectedContact();
        contactsM.getContactHelper().initContactsModification();
        contactsM.getContactHelper().fillAddNewForm(new AddNewData("name", "leen", "keet", "nnn", "art", "Lenina1", "08", "07", "06"));
        contactsM.getContactHelper().submitContactsModification();
        contactsM.getContactHelper().returnAddNew();


    }


}
